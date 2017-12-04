package Week08;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public BankAccount (String accountNumber, String accountHolder, double balance, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean hasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) { this.hasOverdraft = hasOverdraft; }

    public boolean deposit (double amount) {

        if( amount < 0) {
            return false;
        }else{
            this.balance += amount;
            return true;
        }
    }

    public boolean withdraw (double amount) {
        if(amount < 0) {
            return false;
        }else{
            this.balance -= amount;
            return true;
        }
    }

    public boolean addInterest (int interestRate) {
        if(interestRate < 0 && !hasOverdraft) {
            return false;
        }else{
            this.balance += this.balance * (interestRate / 100.0);
            return true;
        }
    }

    @Override
    public String toString () {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }


    public static void main (String[] args) {

        BankAccount b = new BankAccount("1322123", "Morgan", 0, true);
        System.out.println("Creating account ...  ");
        System.out.println(b);
        System.out.println("Depositing 1500 ");
        b.deposit(1500);
        System.out.println(b);
        System.out.println("Withdrawing: 250.00 ...");
        b.withdraw(250);
        System.out.println(b);
        System.out.println("Adding​ ​10%​ ​interest​ ​...");
        b.addInterest(10);
        System.out.println(b);
        System.out.println("Final​ ​Balance​ ​is:" + b.getBalance());

    }

}
