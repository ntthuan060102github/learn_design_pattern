package CreationalPatterns.FactoryMethod;

public class MushroomPizza extends Pizza {
    private int price = 5000;

    @Override
    public int getPrice() {
        return this.price;
    }
}
