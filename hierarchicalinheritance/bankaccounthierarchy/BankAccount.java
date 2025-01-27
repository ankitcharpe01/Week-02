package com.inheritance.hierarchicalinheritance.bankaccounthierarchy;

class BankAccount {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account number : " + accountNumber);
        System.out.println("Account balance : " + balance);
    }
}