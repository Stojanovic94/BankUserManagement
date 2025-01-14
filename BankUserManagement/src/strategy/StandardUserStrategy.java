package strategy;

import java.util.List;

public class StandardUserStrategy implements UserTypeStrategy {
    @Override
    public double getMaxWithdrawalAmount() {
        return 5000.0;
    }

    @Override
    public List<String> getSpecialServices() {
        return List.of("Basic Support");
    }

    @Override
    public boolean hasAccessToAccount(String accountType) {
        return accountType.equals("Savings");
    }
}
