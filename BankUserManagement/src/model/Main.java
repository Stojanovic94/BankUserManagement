// Ažurirana klasa Main
package model;

import factory.UserFactory;

public class Main {
    public static void main(String[] args) {
        // Kreiramo korisnike pomoću fabrike
        BankUser standardUser = UserFactory.createUser("standard", "Marko Marković");
        BankUser vipUser = UserFactory.createUser("vip", "Ana Anić");
        BankUser entrepreneurUser = UserFactory.createUser("entrepreneur", "Jovan Jovanović");

        // Ispisujemo informacije o korisnicima
        System.out.println(standardUser);
        System.out.println(vipUser);
        System.out.println(entrepreneurUser);

        // Proveravamo specifične funkcionalnosti
        System.out.println("Da li Marko ima pristup tekućem računu? " +
                standardUser.canAccessAccount("Current"));
        System.out.println("Da li Ana ima pristup štednom računu? " +
                vipUser.canAccessAccount("Savings"));
        System.out.println("Da li Jovan ima pristup poslovnom računu? " +
                entrepreneurUser.canAccessAccount("Business"));
    }
}
