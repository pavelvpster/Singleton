import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final int N = 1000;

    public static void main(String[] args) {
        System.out.println("SingletonTest");

        CyclicBarrier barrier = new CyclicBarrier(N);
        List<Thread> threads = IntStream.range(0, N)
                .boxed()
                .map(i -> new Thread(() -> {
                    try {
                        barrier.await();
                        IntStream.range(0, 1000)
                                .forEach(j -> HolderSingleton.getInstance());
                    } catch (Throwable t) {
                    }
                }))
                .collect(Collectors.toList());

        threads.forEach(Thread::start);

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
            }
        });

        System.out.println("Count: " + HolderSingleton.referenceCount);
    }
}
