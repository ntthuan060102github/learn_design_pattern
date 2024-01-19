package CreationalPatterns.Singleton;

public class SingletonThread extends Thread {
    public void run() {
        try {
            ThreadSafeSingleton.getInstance().showValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
