/**
 * This implementation uses synchronization.
 */
public class SynchronizedSingleton extends SingletonBase {
    private static SynchronizedSingleton instance;

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
