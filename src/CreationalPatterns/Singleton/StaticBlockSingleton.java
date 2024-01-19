package CreationalPatterns.Singleton;

public class StaticBlockSingleton {
    private int value = 10;
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {};

    static {
        try {
            instance = new StaticBlockSingleton();
        }
        catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
    
    public void showValue() {
        System.out.println(value);
    }
}
