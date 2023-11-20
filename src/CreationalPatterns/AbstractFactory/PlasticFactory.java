package CreationalPatterns.AbstractFactory;

public class PlasticFactory extends AbstractFactory{

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
    
}
