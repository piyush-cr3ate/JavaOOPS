package College.Unit1.PracticeQues3;

class BankAccount{
    private String AccountHolder;
    private String AccountNumber;
    private double Balance;

    public static int accountCount=0;
    public static final String bankName = "HDFC";

    public BankAccount(String AccountHolder, String AccountNumber, double Balance){
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;

        accountCount++;
    }

    //Getters
    public String getAccountHolder() {

        return AccountHolder;

    }

    public String getAccountNumber() {

        return AccountNumber;

    }

    public double getBalance() {

        return Balance;

    }

    // Setters

    public void setAccountHolder(String AccountHolder) {

        this.AccountHolder = AccountHolder;

    }

    public void setAccountNumber(String accountNumber) {

        this.AccountNumber = AccountNumber;

    }

    public void setBalance(double balance) {

        this.Balance = balance;

    }

}


public class BankTest {
    public static void main(String[] args) {

        BankAccount a1 =
                new BankAccount("Ravi", "ACC101", 25000);

        BankAccount a2 =
                new BankAccount("Sneha", "ACC102", 40000);

        System.out.println(a1.getAccountHolder());
        System.out.println("Balance: " + a2.getBalance());
        System.out.println("Bank: " + BankAccount.bankName);
        System.out.println("Total Accounts: " + BankAccount.accountCount);
    }
}
