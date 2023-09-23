import java.util.concurrent.atomic.AtomicLong;

/**
 * The code in this class is needed for test purposes only.
 */
public abstract class SingletonBase {
    public static AtomicLong referenceCount = new AtomicLong(0L);

    public SingletonBase() {
        referenceCount.incrementAndGet();

        // this 'sleep' simulates time consuming action
        try {
            Thread.sleep(0L);
        } catch (InterruptedException ignored) {
        }
    }
}
