package CreationalPatterns.Singleton;

public class EagerInitializedSingleton {
    private int value = 10;

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {}

    public void showValue() {
        System.out.println(value);
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}