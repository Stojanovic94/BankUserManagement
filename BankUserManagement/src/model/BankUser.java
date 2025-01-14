package model;

import strategy.UserTypeStrategy;
import java.util.List;

public class BankUser {
    private String name;
    private UserTypeStrategy userTypeStrategy;

    public BankUser(String name, UserTypeStrategy userTypeStrategy) {
        this.name = name;
        this.userTypeStrategy = userTypeStrategy;
    }

    public double getMaxWithdrawal() {
        return userTypeStrategy.getMaxWithdrawalAmount();
    }

    public List<String> getServices() {
        return userTypeStrategy.getSpecialServices();
    }

    public boolean canAccessAccount(String accountType) {
        return userTypeStrategy.hasAccessToAccount(accountType);
    }

    @Override
    public String toString() {
        return "BankUser{name='" + name + "', maxWithdrawal=" + getMaxWithdrawal() +
                ", services=" + getServices() + "}";
    }
}
