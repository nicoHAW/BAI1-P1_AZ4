package bankAccount;

//MainClass
public class CurrentAccount extends BankAccount {

    //VARIABLES    
    private int standardFee;


    //CONSTRUCTOR
    public CurrentAccount(String bankId, long balance, int standardFee) {
        super(bankId, balance);
        this.standardFee = standardFee;
    } //constructor

    public CurrentAccount(String bankId, int standardFee) {
        super(bankId);
        this.standardFee = standardFee;
    } // constructor


    //METHODS
    // Method to check if Balance is sufficient

    @Override
    public void withdraw (long amount) {
        super.withdraw(amount);
        this.balance = this.balance-this.standardFee;
    } //method withdraw

    //STANDARD METHODS
    @Override
    public String toString() {
        return String.format("[CurrentAccount : BankID = %s \n Balance = %d \n StandardFee = %d]", this.bankId, this.balance, this.standardFee);
    }

    public long getFee() {
        return this.standardFee;
    }

} //class BankAccount
