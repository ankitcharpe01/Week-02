package com.encapsulationandpolymorphism.bankingsystem;

public class SavingsAccount extends BankAccount{

    public static final double interestRate=0.02;
    public static final double loan=6.0;

    public SavingsAccount(long accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest=getBalance()*interestRate;
        setBalance(getBalance()+interest);
        System.out.println("Interest Added to your current account, New Interest: "+getBalance());

    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Savings Account: " + getAccountNumber());
        } else {
            System.out.println("Loan request denied due to insufficient eligibility.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance()+loan>=10000;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}
