package CreationalPatterns.SimpleFactory;

public class CreditCardFactory {
    public CreditCard createCreditCard(String cardType) throws Exception {
        switch (cardType) {
            case "silver":
                return new SilverCard();

            case "gold":
                return new GoldCard();

            case "titanium":
                return new TitaniumCard();

            default:
                throw new Exception("Invalid credit card type!");
        }
    }
}
