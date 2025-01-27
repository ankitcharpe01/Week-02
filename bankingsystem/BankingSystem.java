package com.encapsulationandpolymorphism.bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(3443566, "Mr.smith", 5000);
        BankAccount current = new CurrentAccount(7466454, "Mr.john", 7000);

        savings.displayInfo();
        savings.deposit(10000);
        savings.withdraw(10000);
        savings.calculateInterest();
        savings.applyForLoan(10000.0);
        System.out.println();

        current.displayInfo();
        current.deposit(20000);
        current.withdraw(5000);
        current.calculateInterest();
        current.applyForLoan(30000.0);
    }
}
