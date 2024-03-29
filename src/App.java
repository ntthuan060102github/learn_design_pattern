import java.util.Scanner;

import BehavioralPatterns.chain_of_responsibility.AAccount;
import BehavioralPatterns.chain_of_responsibility.Bank;
import BehavioralPatterns.chain_of_responsibility.Bitcoin;
import BehavioralPatterns.chain_of_responsibility.Paypal;
import BehavioralPatterns.command.Buld;
import BehavioralPatterns.command.RemoteControl;
import BehavioralPatterns.command.TurnOnCommand;
import BehavioralPatterns.command.TurnOffCommand;
import BehavioralPatterns.iterator.Item;
import BehavioralPatterns.iterator.Menu;
import BehavioralPatterns.iterator.IItemIterator;
import BehavioralPatterns.mediator.Chatroom;
import BehavioralPatterns.mediator.User;
import BehavioralPatterns.memento.Editor;
import BehavioralPatterns.memento.EditorMemento;
import BehavioralPatterns.observer.IObserver;
import BehavioralPatterns.observer.Subject;
import BehavioralPatterns.state.Phone;
import BehavioralPatterns.strategy.BubbleSortStrategy;
import BehavioralPatterns.strategy.QuickSortStrategy;
import BehavioralPatterns.strategy.Sorter;
import BehavioralPatterns.template_method.AndroidBuilder;
import BehavioralPatterns.template_method.IosBuilder;
import BehavioralPatterns.visitor.IHuman;
import BehavioralPatterns.visitor.IMonster;
import BehavioralPatterns.visitor.CuteDogie;
import BehavioralPatterns.visitor.Dracula;
import BehavioralPatterns.visitor.Warrior;
import BehavioralPatterns.visitor.Wizard;

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

        /*-------------------------------------------------------------------------------------- */

        /*
         * Iterator
         */

        // Menu menu = new Menu();
        // menu.addItem(new Item("Home", "/home"));
        // menu.addItem(new Item("Java", "/java"));
        // menu.addItem(new Item("Spring Boot", "/spring-boot"));
 
        // IItemIterator<Item> iterator = menu.iterator();

        // while (iterator.hasNext()) {
        //     Item item = iterator.next();
        //     System.out.println(item);
        // }

        /*-------------------------------------------------------------------------------------- */

        /*
         * Mediator
         */
            
        // Chatroom chatroom = new Chatroom();
        // User user1 = new User("Thuan", chatroom);
        // User user2 = new User("Nhung", chatroom);

        // user1.sendMessage("m1");
        // user1.sendMessage("m1");
        // user2.sendMessage("m3");
        // user1.sendMessage("m4");

        /*-------------------------------------------------------------------------------------- */

        /*
         * Memento
         */

        // Editor editor = new Editor();

        // editor.type("1");
        // System.out.println(editor.getContent());

        // editor.type("2");
        // System.out.println(editor.getContent());

        // EditorMemento saved = editor.save();

        // editor.type("3");
        // System.out.println(editor.getContent());

        // editor.undo(saved);
        // System.out.println(editor.getContent());

        /*-------------------------------------------------------------------------------------- */

        /*
         * Observer
         */

        // Subject subject = new Subject();
        // IObserver observer1 = new IObserver() {
        //     public void update(String message)
        //     {
        //         System.out.println("[Oserver 1]: " + message); 
        //     }
        // };
        // IObserver observer2 = new IObserver() {
        //     public void update(String message)
        //     {
        //         System.out.println("[Oserver 2]: " + message); 
        //     }
        // };

        // subject.attach(observer1);
        // subject.attach(observer2);

        // subject.notifyChange(("change"));

        /*-------------------------------------------------------------------------------------- */

        /*
         * Visitor
         */

        // IHuman warrior = new Warrior();
        // IHuman wizard = new Wizard();

        // IMonster dogie = new CuteDogie();
        // IMonster dracula = new Dracula();

        // warrior.hit(dogie);
        // wizard.hit(dogie);

        // warrior.hit(dracula);
        // wizard.hit(dracula);

        /*-------------------------------------------------------------------------------------- */

        /*
         * Strategy
         */

        // int[] smallData = {1, 3, 9, 4};
        // int[] bigData = {1, 3, 9, 4, 7, 9, 5, 1, 2, 6, 4};

        // Sorter sorter = new Sorter(new BubbleSortStrategy(), new QuickSortStrategy());

        // sorter.sort(smallData);
        // sorter.sort(bigData);

        /*-------------------------------------------------------------------------------------- */

        /*
         * State
         */

        // Phone phone = new Phone();

        // phone.pickUp();
        // phone.dial();

        /*-------------------------------------------------------------------------------------- */

        /*
         * Template Method
         */

        AndroidBuilder androidBuilder = new AndroidBuilder();
        androidBuilder.build();

        // Output:
        // Running android tests
        // Linting the android code
        // Assembling the android build
        // Deploying android build to server

        IosBuilder iosBuilder = new IosBuilder();
        iosBuilder.build();

        // Output:
        // Running ios tests
        // Linting the ios code
        // Assembling the ios build
        // Deploying ios build to server
    }
}
