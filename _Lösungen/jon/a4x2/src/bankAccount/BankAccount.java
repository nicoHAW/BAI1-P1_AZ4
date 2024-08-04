package bankAccount;

//MainClass
public class BankAccount {

    //VARIABLES    
    String bankId;
    long balance; 


    //CONSTURUCTOR
    public BankAccount(String bankId, long balance) {
        this.bankId = bankId;
        this.balance = balance;
    } //constuctor

    public BankAccount(String bankId) {
        this.bankId = bankId;
        this.balance = 0;
    } // constuctor


    //METHODS
    // Method to check if Balance is sufficient
    boolean checkBalance(long amount) {
        return this.balance > 0;
    }

    public void withdraw (long amount) {
        assert checkBalance(amount): "Account Balance insufficient"; // balance check
        if (this.balance > 0) {
            this.balance = this.balance - amount;
        } //if
    } //method withdraw

    public void deposit (long amount) {
        this.balance = this.balance + amount;

    } //method deposit

    //STANDARD METHODS
    @Override
    public String toString() {
        return String.format("[<%s> : BankID = %s Balance = %d]", BankAccount.class.getSimpleName(), this.bankId, this.balance);
        //return String.format("[BankAccount : BankID = %s \n Balance = %d \n]", this.bankId, this.balance);

    }

    public String getAccountId() {
        return this.bankId;
    }

    public long getAccountBalance() {
        return this.balance;
    }

} //class BankAccount

// SubClass


