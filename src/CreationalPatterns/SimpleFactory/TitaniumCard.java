package CreationalPatterns.SimpleFactory;

public class TitaniumCard implements CreditCard {
    @Override
    public String getCardType() {
        return "titanium";
    }

    @Override
    public int getCreditLimit() {
        return 3000;
    }

    @Override
    public int getAnnualCharge() {
        return 30;
    }

}
