
/**
 * Optimized implementation: synchronization is needed only for instantiation.
 * https://en.wikipedia.org/wiki/Double-checked_locking
 */
public class DoubleCheckingSingleton extends SingletonBase {
    private static DoubleCheckingSingleton instance;

    public static DoubleCheckingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckingSingleton();
                }
            }
        }
        return instance;
    }
}
