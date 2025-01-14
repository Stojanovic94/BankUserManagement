package strategy;

import java.util.List;

public class VIPUserStrategy implements UserTypeStrategy {
    @Override
    public double getMaxWithdrawalAmount() {
        return 50000.0;
    }

    @Override
    public List<String> getSpecialServices() {
        return List.of("Priority Support", "Exclusive Deals");
    }

    @Override
    public boolean hasAccessToAccount(String accountType) {
        return true; // Pristup svim računima
    }
}
