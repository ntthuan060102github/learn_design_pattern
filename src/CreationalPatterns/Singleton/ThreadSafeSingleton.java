package CreationalPatterns.Singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance = null;
    private double value = Math.random();

    private ThreadSafeSingleton() {}

    public void showValue() {
        System.out.println(value);
    }

    public static synchronized ThreadSafeSingleton getInstance() throws InterruptedException {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        Thread.sleep(2000);
        return instance;
    }
}