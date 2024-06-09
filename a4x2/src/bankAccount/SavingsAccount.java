package bankAccount;

//MainClass
public class SavingsAccount extends BankAccount {

    //VARIABLES    
    //    private String bankId;
    //    private long balance;
    private int rates;


    //CONSTURUCTOR
    public SavingsAccount(String bankId, long balance, int rates) {
        super(bankId, balance);
        this.rates = rates;
    } //constuctor

    //METHODS
    public void giveInterest() {
        float interest = (float) rates/1000;
        float interestAmount = balance*interest;
        balance = balance + (long)interestAmount;
    } //method giveInterest

    public int giveRates() {
        return this.rates;
    } //method giveRates

    //STANDARD METHODS
    @Override
    public String toString() {
        return String.format("[BankAccount : BankID = %s \n Balance = %d \n ates = %d]", this.bankId, this.balance, this.rates);
    }

    public long getInterestRate() {
        return this.rates;
    }    

} //class BankAccount
