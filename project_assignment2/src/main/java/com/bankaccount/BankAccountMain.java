package com.bankaccount;

/**
 * Hello world!
 *
 */

 public class BankAccountMain {
    public static void main(String[] args) {
        // Create account1  and display account information
        System.out.println("Creating account for David Smith...");
        BankAccountClass account1 = new BankAccountClass("100000", "David Smith", 0.0);
   
        System.out.println("\nDepositing $3000.50 to David's account...");
        BankAccountUtility.deposit(account1, 3000.50);
        BankAccountUtility.displayAccountInfo(account1);
        
        // Create account2 and display account information
        System.out.println("\nCreating account for Emily Lee...");
        BankAccountClass account2 = new BankAccountClass("100001", "Emily Lee", 0.0);
        System.out.println("\nDepositing $850.00 to Emily's account...");
        BankAccountUtility.deposit(account2, 850.00);
        
       
        System.out.println("\nWithdrawing $400.85 from Emily's account...");
        BankAccountUtility.withdraw(account2, 400.85);
        // Display account2 after withdrwal and balance
        BankAccountUtility.displayAccountInfo(account2);
        
        // Display how many accounts there are currently
        BankAccountUtility.displayNumberOfAccounts();
    }
}