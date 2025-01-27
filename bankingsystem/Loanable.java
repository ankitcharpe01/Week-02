package com.encapsulationandpolymorphism.bankingsystem;

public interface Loanable {
    public void applyForLoan(double amount);
    public boolean calculateLoanEligibility();
}
