package StructuralPatterns.Decorator;

public abstract class APizzaDecorator implements IPizza {
    protected IPizza pizza;

    public APizzaDecorator(IPizza pizza)
    {
        this.pizza = pizza;
    }
}
