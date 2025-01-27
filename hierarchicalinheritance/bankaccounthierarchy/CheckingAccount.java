package com.inheritance.hierarchicalinheritance.bankaccounthierarchy;


class CheckingAccount extends BankAccount {
    private int withdrawalLimit;

    public CheckingAccount(long accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account type is checking account!");
    }

    @Override
    public void display() {
        displayAccountType();
        super.display();
        System.out.println("Withdrawal limit : " + withdrawalLimit);
    }
}