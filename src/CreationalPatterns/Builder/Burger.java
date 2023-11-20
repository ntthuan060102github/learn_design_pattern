package CreationalPatterns.Builder;

public class Burger {
    protected BurgerBuilder.BurgerSize size;
    protected boolean hasPotato;
    protected boolean hasCheese;
    protected boolean hasChiliSauce;

    public Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.hasPotato = builder.hasPotato;
        this.hasCheese = builder.hasCheese;
        this.hasChiliSauce = builder.hasChiliSauce;
    }

    public void getBurgerComponents() {
        System.out.println(this.size);
        System.out.println(this.hasPotato);
        System.out.println(this.hasCheese);
        System.out.println(this.hasChiliSauce);
    }
}
