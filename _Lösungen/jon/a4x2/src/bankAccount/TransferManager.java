package bankAccount;

public class TransferManager {

    BankAccount fromAccount;
    BankAccount toAccount;

    public void transfer(BankAccount fromAccount, BankAccount toAccount, long amount) {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
