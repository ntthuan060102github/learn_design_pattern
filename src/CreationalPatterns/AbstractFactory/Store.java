package CreationalPatterns.AbstractFactory;

public class Store {
    public enum MaterialType {
        Plastic,
        Wood
    }

    public AbstractFactory createFactory(MaterialType materialType) throws Exception {
        switch (materialType) {
            case Plastic:
                return new PlasticFactory();

            case Wood:
            return new WoodFactory();
        
            default:
                throw new Exception("Invalid material type!");
        }
    }
}
