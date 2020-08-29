package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

// American Express validation strategy
public class AmexStrategy extends ValidationStrategy {

    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid;


        isValid = creditCard.getNumber().startsWith("37") ||
                    creditCard.getNumber().startsWith("34");

        if(isValid){
            isValid = creditCard.getNumber().length() == 15;
        }

        if(isValid){
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}
