package StructuralPatterns.Decorator;

public class PepperDecorator extends APizzaDecorator {
    public PepperDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        return this.pizza.doPizza() + this.addPepper();
    }

    private String addPepper()
    {
        return " + pepper";
    }
    
}
