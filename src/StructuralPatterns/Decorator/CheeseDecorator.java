package StructuralPatterns.Decorator;

public class CheeseDecorator extends APizzaDecorator {
    public CheeseDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        return this.pizza.doPizza() + this.addCheese();
    }

    private String addCheese()
    {
        return " + cheese";
    }
}
