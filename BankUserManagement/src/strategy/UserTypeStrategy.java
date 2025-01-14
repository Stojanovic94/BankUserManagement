package strategy;

import java.util.List;

public interface UserTypeStrategy {
    double getMaxWithdrawalAmount();
    List<String> getSpecialServices();
    boolean hasAccessToAccount(String accountType);
}
