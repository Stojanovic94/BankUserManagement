// Nova klasa EntrepreneurStrategy
package strategy;

import java.util.List;

public class EntrepreneurStrategy implements UserTypeStrategy {
    @Override
    public double getMaxWithdrawalAmount() {
        return 20000.0;
    }

    @Override
    public List<String> getSpecialServices() {
        return List.of("Business Loans", "Accounting Support", "Priority Transactions");
    }

    @Override
    public boolean hasAccessToAccount(String accountType) {
        return accountType.equals("Business") || accountType.equals("Savings");
    }
}
