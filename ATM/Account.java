package ATM;
public class Account {
    private int accountNumber;
    private double maxBalance;
    private double availableBalance;
    private int pin;
    private String username;
    boolean isAdmin;

    public Account(String CUsername, int CaccountNumber, int Cpin, double CmaxBalance, double CavailableBalance, boolean CisAdmin){
        
        setAccountNumber(CaccountNumber);
        setMaxBalance(CmaxBalance);
        setAvailableBalance(CavailableBalance);
        setPin(Cpin);
        setUsername(CUsername);
        setIsAdmin(CisAdmin); 
    }

    public void setAccountNumber(int num) {
        accountNumber = num;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void setMaxBalance(double balance){
        maxBalance=balance;
    } 

    public double getMaxBalance(){ 
        return maxBalance;
    }

    public void setAvailableBalance(double amount) {
        availableBalance = amount;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setPin(int n) {
        pin = n;
    }
    public int getPin() {
        return pin;
    }

    public void setUsername(String name) {
        username = name;
    } 

    public String getUsername() {
        return username;
    }

    public void setIsAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }
}
