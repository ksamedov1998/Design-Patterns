package creational.abstractFactory;

public class AmericanExpressFactory  extends CreditCardFactory{
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD: {
                return new AmexGoldCreditCard();
            }
            case PLATINUM:{
                    return new AmexPlatinumCreditCard();
            }
            default:
                break;
        }
        return null;
    }


    @Override
    public Validator getValidator(CardType cardType) {
        //todo the same goes here for Validator
        return null;
    }
}
