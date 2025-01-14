// Ažurirana klasa UserFactory
package factory;

import model.BankUser;
import strategy.*;

public class UserFactory {
    public static BankUser createUser(String userType, String name) {
        switch (userType.toLowerCase()) {
            case "standard":
                return new BankUser(name, new StandardUserStrategy());
            case "vip":
                return new BankUser(name, new VIPUserStrategy());
            case "entrepreneur":
                return new BankUser(name, new EntrepreneurStrategy());
            default:
                throw new IllegalArgumentException("Unknown user type: " + userType);
        }
    }
}
