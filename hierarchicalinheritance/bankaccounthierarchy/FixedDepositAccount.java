package com.inheritance.hierarchicalinheritance.bankaccounthierarchy;

class FixedDepositAccount extends BankAccount {
    private int depositYear;

    public FixedDepositAccount(long accountNumber, double balance, int depositYear) {
        super(accountNumber, balance);
        this.depositYear = depositYear;
    }

    public void displayAccountType() {
        System.out.println("Account type is fixed deposit account!");
    }

    @Override
    public void display() {
        displayAccountType();
        super.display();
        System.out.println("Amount fixed for " + depositYear + " years");
    }
}
