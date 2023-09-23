/**
 * Not thread-safe Singleton implementation.
 */
public class UnsafeSingleton extends SingletonBase {
    private static UnsafeSingleton instance;

    public static UnsafeSingleton getInstance() {
        if (instance == null) {
            instance = new UnsafeSingleton();
        }
        return instance;
    }
}
