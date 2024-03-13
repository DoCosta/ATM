package ATM;

import java.util.ArrayList;

public class Database {
    static ArrayList<Account> accounts = new ArrayList<Account>();

    public Database(){
        Account account1 = new Account("Customer1", 1, 1234, 2000, 1900, true);
        Account account2 = new Account("Customer2", 2, 12345, 2300, 1200, false);
        Account account3 = new Account("Customer3", 3, 123456, 2200, 1100, false);
        Account account4 = new Account("Customer4", 4, 1234567, 2100, 900, false);
        
    
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
    }

    public static Account getAccount(int accountNumber){
        for (Account account : accounts) {
            if(account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; //If no matching account number is found
    }

    private Account getUserPin(int PIN){
        for (Account account : accounts) {
            if(account.getPin() == PIN) {
                return account;
            }
        }
        return null; //If no matching account Pin is found
    }
    
    public boolean authentification(int userPin){
        Account userAccount = getUserPin(userPin);
        if(userAccount != null)
            return true;
        else 
            return false;
    }
    
    public double getAvailableBalance(int accountNumber)
    {
       return getAccount(accountNumber).getAvailableBalance();
    } 

    public double getMaxbalance(int accountNumber)
    {
       return getAccount(accountNumber).getMaxBalance();
    }
}
