package CreationalPatterns.Singleton;

public class BillPughSingletonThread extends Thread{
    public void run() {
        BillPughSingleton.getInstance().showValue();
    }
}
