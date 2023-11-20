package CreationalPatterns.SimpleFactory;

public class GoldCard implements CreditCard {
    @Override
    public String getCardType() {
        return "gold";
    }

    @Override
    public int getCreditLimit() {
        return 2000;
    }

    @Override
    public int getAnnualCharge() {
        return 20;
    }

}
