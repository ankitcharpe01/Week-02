package com.inheritance.hierarchicalinheritance.bankaccounthierarchy;

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account type is saving account!");
    }

    @Override
    public void display() {
        displayAccountType();
        super.display();
        System.out.println("Interest rate is " + interestRate + "%");
    }
}

