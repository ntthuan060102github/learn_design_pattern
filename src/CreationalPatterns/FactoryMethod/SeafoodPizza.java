package CreationalPatterns.FactoryMethod;

public class SeafoodPizza extends Pizza {
    final int price = 1000;

    @Override
    public int getPrice() {
        return this.price;
    }
}
