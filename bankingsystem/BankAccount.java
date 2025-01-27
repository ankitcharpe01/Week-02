package com.encapsulationandpolymorphism.bankingsystem;

public abstract class BankAccount implements Loanable{
    private long accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(long accountNumber,String holderName, double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public abstract void calculateInterest();

    public void displayInfo(){
        System.out.println("Account Number is:"+getAccountNumber()+"\nHolder Name is: "+getHolderName()+"\nBalence is: "+getBalance());
    }
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
