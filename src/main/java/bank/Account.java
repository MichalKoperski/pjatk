package bank;

public class Account {
    private double balance;
    private static double interest;

    public double getBalance(){
        return balance;
    }
    public void deposit(double a) {
        balance+=a;
    }
    public void withdraw(double b) {
        balance-=b;
    }
    public void transfer(Account account, double c) {
        account.deposit(c);
        this.withdraw(c);
    }
    public static void setInterestRate(double d) {
        interest=+d;
    }
    public void addInterest() {
        balance=balance*(1+(interest/100));
    }
}
