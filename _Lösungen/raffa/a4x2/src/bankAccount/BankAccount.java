package bankAccount;

/**
 * BankAccount
 * 
 * @author   Raffael Apitz & Frithjof Beims
 * @version  03.06.2024
 *
 */
public abstract class BankAccount {
    //abstract class, because we dont want anyone to create an instance of a BankAccount

    private String id;
    private long balance;

    public BankAccount(String id, long startingBalance) {
        assert id != null && id != "" : "The id is invalid";
        assert startingBalance >= 0 : "The starting balance is invalid";
        this.id = id;
        this.balance = startingBalance;
    }

    public BankAccount(String id) {
        this(id, 0);
    }

    public void withdraw(long amount) {
        assert amount >= 0 : "You can't withdraw a negative amount";
        assert balance >= amount : "The balance of the BankAccount you are trying to withdraw from is insufficient for the amount you're trying to withdraw.";
        balance -= amount;
    }

    public void deposit(long amount) {
        assert amount >= 0 : "You can't deposit a negative amount";
        balance += amount;
    }

    public String getAccountId() {
        return id;
    }

    public long getAccountBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("[<%s>: id=%s, balance=%d]", BankAccount.class.getSimpleName(), id, balance);
    }    

}
