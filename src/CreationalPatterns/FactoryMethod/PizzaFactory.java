package CreationalPatterns.FactoryMethod;

public class PizzaFactory {
    public enum PizzaType {
        Seafood,
        Mushroom
    }

    public Pizza createPizza(PizzaType pizzaType) throws Exception {
        switch (pizzaType) {
            case Seafood:
                return new SeafoodPizza();

            case Mushroom:
                return new MushroomPizza();
        
            default:
                throw new Exception("Invalid pizza type!");
        }
    }
}
