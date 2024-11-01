package com.bankaccount;

public class BankAccountUtility {
    // Account Operation Methods
    public static void deposit(BankAccountClass account, double amount) {
        if (amount > 0) {
            double newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);
            System.out.println("Deposit successful. New balance: $" + String.format("%.2f", newBalance));
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public static boolean withdraw(BankAccountClass account, double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            double newBalance = account.getBalance() - amount;
            account.setBalance(newBalance);
            System.out.println("Withdrawal successful. New balance: $" + String.format("%.2f", newBalance));
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            return false;
        }
    }

    public static void calculateInterest(BankAccountClass account) {
        double interest = account.getBalance() * account.getInterestRate();
        double newBalance = account.getBalance() + interest;
        account.setBalance(newBalance);
        System.out.println("Interest added: $" + String.format("%.2f", interest));
        System.out.println("New balance after interest: $" + String.format("%.2f", newBalance));
    }

    // Utility Methods
    public static void displayAccountInfo(BankAccountClass account) {
        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: $" + String.format("%.2f", account.getBalance()));
    }

    public static void displayNumberOfAccounts() {
        System.out.println("\nTotal Number of Accounts: " + BankAccountClass.getNumberOfAccounts());
    }
}