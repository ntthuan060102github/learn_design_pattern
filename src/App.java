import java.util.Scanner;

import BehavioralPatterns.chain_of_responsibility.AAccount;
import BehavioralPatterns.chain_of_responsibility.Bank;
import BehavioralPatterns.chain_of_responsibility.Bitcoin;
import BehavioralPatterns.chain_of_responsibility.Paypal;
import BehavioralPatterns.command.Buld;
import BehavioralPatterns.command.RemoteControl;
import BehavioralPatterns.command.TurnOnCommand;
import BehavioralPatterns.command.TurnOffCommand;

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
import CreationalPatterns.Singleton.BillPughSingleton;
import CreationalPatterns.Singleton.BillPughSingletonThread;
import CreationalPatterns.Singleton.EagerInitializedSingleton;
import CreationalPatterns.Singleton.LazyInitializedSingleton;
import CreationalPatterns.Singleton.SingletonThread;
import CreationalPatterns.Singleton.StaticBlockSingleton;
import CreationalPatterns.Singleton.ThreadSafeSingleton;

import StructuralPatterns.Composite.AGiftBase;
import StructuralPatterns.Composite.SingleGift;
import StructuralPatterns.Composite.GiftComposite;
import StructuralPatterns.Decorator.ChickenPizza;
import StructuralPatterns.Decorator.TomatoPizza;
import StructuralPatterns.Facade.Computer;
import StructuralPatterns.Facade.ComputerFacade;
import StructuralPatterns.Decorator.PepperDecorator;
import StructuralPatterns.Decorator.CheeseDecorator;
import StructuralPatterns.Proxy.LabDoor;
import StructuralPatterns.Proxy.SecureDoor;

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

        /*-------------------------------------------------------------------------------------- */

        /*
         * Eager Initialized Singleton  
        */
        // EagerInitializedSingleton.getInstance().showValue();
        // EagerInitializedSingleton.getInstance().showValue();


        /*
         * Static block initialization 
        */

        // StaticBlockSingleton.getInstance().showValue();
        // StaticBlockSingleton.getInstance().showValue();


        /*
         * Lazy Initialization
         */

        // LazyInitializedSingleton.getInstance().showValue();
        // LazyInitializedSingleton.getInstance().showValue();

        /*
         * Thread Safe Singleton 
        */
        // Thread thread1 = new SingletonThread();
        // Thread thread2 = new SingletonThread();
        // Thread thread3 = new SingletonThread();
        // Thread thread4 = new SingletonThread();

        // thread1.start();
        // thread2.start();
        // thread3.start();
        // thread4.start();

        /*
         * Bill PughS ingleton
         */

        // Thread thread1 = new BillPughSingletonThread();
        // Thread thread2 = new BillPughSingletonThread();
        // Thread thread3 = new BillPughSingletonThread();
        // Thread thread4 = new BillPughSingletonThread();

        // thread1.start();
        // thread2.start();
        // thread3.start();
        // thread4.start();

        /*-------------------------------------------------------------------------------------- */

        /*
         * Composite
         */

        // SingleGift singleGift1 = new SingleGift("phone1", 1);
        // SingleGift singleGift2 = new SingleGift("phone2", 1);
        // SingleGift singleGift3 = new SingleGift("phone3", 1);
        // SingleGift singleGift4 = new SingleGift("phone4", 1);
        // GiftComposite compositeGift1 = new GiftComposite("box1", 1);
        // GiftComposite compositeGift2 = new GiftComposite("box2", 1);

        // compositeGift1.add(singleGift1);
        // compositeGift1.add(singleGift2);

        // compositeGift2.add(singleGift3);
        // compositeGift2.add(singleGift4);
        // compositeGift2.add(compositeGift1);

        // System.out.println(compositeGift1.getTotalPrice());
        // System.out.println(compositeGift2.getTotalPrice());

        /*-------------------------------------------------------------------------------------- */

        /*
         * Decorator
         */

        // TomatoPizza tomatoPizza = new TomatoPizza();
        // ChickenPizza chickenPizza = new ChickenPizza();
        // PepperDecorator pepperDecorator = new PepperDecorator(tomatoPizza);
        // CheeseDecorator cheeseDecorator = new CheeseDecorator(chickenPizza);
        // CheeseDecorator fullToppingDecorator = new CheeseDecorator(pepperDecorator);

        // System.out.println(tomatoPizza.doPizza());
        // System.out.println(chickenPizza.doPizza());
        // System.out.println(pepperDecorator.doPizza());
        // System.out.println(cheeseDecorator.doPizza());
        // System.out.println(fullToppingDecorator.doPizza());

        /*-------------------------------------------------------------------------------------- */

        /*
         * Facade
         */

        // Computer computer = new Computer();
        // ComputerFacade computerFacade = new ComputerFacade(computer);

        // computerFacade.turnOn();
        // computerFacade.turnOff();

        /*-------------------------------------------------------------------------------------- */

        /*
         * Proxy
         */

        // LabDoor labDoor = new LabDoor();
        // SecureDoor secureDoor = new SecureDoor(labDoor);

        // secureDoor.open("test");
        // secureDoor.open("password");

        /*-------------------------------------------------------------------------------------- */

        /*
         * Chain of Responsibility
         */

        // AAccount bank = new Bank(200);
        // AAccount paypal = new Paypal(500);
        // AAccount bitcoin = new Bitcoin(1000);

        // bank.setNext(paypal);
        // paypal.setNext(bitcoin);

        // bank.pay(700);

        /*-------------------------------------------------------------------------------------- */

        /*
         * Command
         */

        // Buld buld = new Buld();
        // TurnOnCommand turnOnCommand = new TurnOnCommand(buld);
        // TurnOffCommand turnOffCommand = new TurnOffCommand(buld);
        // RemoteControl remoteControl = new RemoteControl();

        // remoteControl.submit(turnOnCommand);
        // remoteControl.submit(turnOffCommand);
    }
}
