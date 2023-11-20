package CreationalPatterns.AbstractFactory;

public class WoodFactory extends AbstractFactory{

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
    
}
