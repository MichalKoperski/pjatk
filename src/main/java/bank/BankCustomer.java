package bank;

public class BankCustomer {
    private Account account = new Account();
    private Person person;

    public BankCustomer(Person person) {
        this.person=person;
    }
    public Account getAccount() {
        return account;
    }
    public String toString() {
        return "Customer: "+person.getName() +", balance: "+getAccount().getBalance();
    }
}
