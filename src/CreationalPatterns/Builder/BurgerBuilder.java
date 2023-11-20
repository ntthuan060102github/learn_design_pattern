package CreationalPatterns.Builder;

public class BurgerBuilder {
    public enum BurgerSize {
        Small,
        Medium,
        Large
    }

    public BurgerSize size;
    public boolean hasPotato = false;
    public boolean hasCheese = false;
    public boolean hasChiliSauce = false;

    public void choiceSize(BurgerSize size) {
        this.size = size;
    }

    public void addPotato() {
        this.hasPotato = true;
    }

    public void addCheese() {
        this.hasCheese = true;
    }

    public void addChiliSauce() {
        this.hasChiliSauce = true;
    }

    public Burger createBurger() {
        return new Burger(this);
    }
}
