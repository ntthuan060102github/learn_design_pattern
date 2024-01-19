package StructuralPatterns.Composite;

public abstract class AGiftBase {
    protected String name;
    protected int price;

    public AGiftBase(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public abstract int getTotalPrice();
}