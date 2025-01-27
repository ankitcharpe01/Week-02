package com.inheritance.hierarchicalinheritance.bankaccounthierarchy;

public class BankAccountHierarchy {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(110001, 80000, 2.5);
        CheckingAccount ca = new CheckingAccount(220002, 90000, 5000);
        FixedDepositAccount fda = new FixedDepositAccount(330003, 55000, 5);
        sa.display();
        System.out.println("------------------------------------");
        ca.display();
        System.out.println("------------------------------------");
        fda.display();

    }
}
