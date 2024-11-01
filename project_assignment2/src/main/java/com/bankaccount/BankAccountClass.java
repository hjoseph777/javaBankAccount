package com.bankaccount;

/**
 * BankAccountClass
 */
public class BankAccountClass {
    // Private attirbutes and Instance variables
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;
    private static int numberOfAccounts = 0; //static does nt need to be instantiated
    
    // Constructor to instantiate the private attributes of the object
    public BankAccountClass(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = 0.05; // Default interest rate of 5%
        numberOfAccounts++; // Increment the total number of accounts
    }

    // Getter and Setter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}