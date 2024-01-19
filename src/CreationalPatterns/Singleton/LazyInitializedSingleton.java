package CreationalPatterns.Singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance = null;
    private int value = 10;

    private LazyInitializedSingleton() {}

    public void showValue() {
        System.out.println(value);
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
