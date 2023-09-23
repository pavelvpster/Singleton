/**
 * This implementation uses Java memory model features.
 * https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
 */
public class HolderSingleton extends SingletonBase {
    private static class Holder {
        static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
