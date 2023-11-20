package CreationalPatterns.SimpleFactory;

public class SilverCard implements CreditCard {
    @Override
    public String getCardType() {
        return "silver";
    }

    @Override
    public int getCreditLimit() {
        return 1000;
    }

    @Override
    public int getAnnualCharge() {
        return 10;
    }

}
