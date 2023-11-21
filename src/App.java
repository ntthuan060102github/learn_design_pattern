import java.util.Scanner;

import CreationalPatterns.AbstractFactory.AbstractFactory;
import CreationalPatterns.AbstractFactory.Store;
import CreationalPatterns.AbstractFactory.Store.MaterialType;
import CreationalPatterns.Builder.BurgerBuilder;
import CreationalPatterns.Builder.BurgerBuilder.BurgerSize;
import CreationalPatterns.FactoryMethod.Pizza;
import CreationalPatterns.FactoryMethod.PizzaFactory;
import CreationalPatterns.FactoryMethod.PizzaFactory.PizzaType;
import CreationalPatterns.Prototype.Cloneable;
import CreationalPatterns.Prototype.Documentation;
import CreationalPatterns.SimpleFactory.CreditCard;
import CreationalPatterns.SimpleFactory.CreditCardFactory;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Simple Factory
        */
        /*
        try (Scanner scanner = new Scanner(System.in)) {
            String cardType;

            System.out.println("Enter a credit type: ");
            cardType = scanner.nextLine();

            CreditCard yourCreditCard = new CreditCardFactory().createCreditCard(cardType);

            System.out.println(yourCreditCard.getCardType());
            System.out.println(yourCreditCard.getAnnualCharge());
            System.out.println(yourCreditCard.getCreditLimit());
        }
         */

        /*-------------------------------------------------------------------------------------- */

        /*
         * Factory Method
        */
        /*
        try (Scanner scanner = new Scanner(System.in)) {
            Pizza yourPizza = new PizzaFactory().createPizza(PizzaType.Mushroom);

            System.out.println(yourPizza.getPrice());
        }
        */
    
        /*-------------------------------------------------------------------------------------- */

        /*
         * Abstract Factory
        */
        /* 
        Store store = new Store();
        AbstractFactory factory = store.createFactory(MaterialType.Wood);
        factory.createChair().getDesc();
        factory.createTable().getDesc();
        */

        /*-------------------------------------------------------------------------------------- */

        /*
         * Builder
        */
        /* 
        BurgerBuilder builder = new BurgerBuilder();
        
        builder.choiceSize(BurgerSize.Medium);
        builder.addCheese();
        builder.addChiliSauce();
        builder.createBurger().getBurgerComponents();
        */

        /*-------------------------------------------------------------------------------------- */

        /*
         * Prototype
        */
        /* 
        Documentation doc = new Documentation(10, "Hello world!");
        Documentation clonedDoc = (Documentation) doc.clone();
        doc.showContent();
        clonedDoc.showContent();
        */
    }
}
