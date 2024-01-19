package CreationalPatterns.Singleton;

public class BillPughSingleton { 
    private double value = Math.random();
    
    private static class SingletonHelper  {
        static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    private BillPughSingleton() { }
    
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showValue() {
        System.out.println(value);
    }
}
