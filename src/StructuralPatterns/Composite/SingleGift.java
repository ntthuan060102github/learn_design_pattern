package StructuralPatterns.Composite;

public class SingleGift extends AGiftBase {
    public SingleGift(String name, int price) {
        super(name, price);
    }

    @Override
    public int getTotalPrice() {
        return this.price;
    }
}
