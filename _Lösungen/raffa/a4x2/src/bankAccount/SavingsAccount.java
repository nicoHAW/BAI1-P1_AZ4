package bankAccount;

/**
 * SavingsAccount
 * 
 * @author   Raffael Apitz & Frithjof Beims
 * @version  03.06.2024
 *
 */
public class SavingsAccount extends BankAccount {

    private int interestRate; // in promille

    public SavingsAccount(String id, long startingBalance, int interestRate) {
        super(id, startingBalance);
        assert interestRate >= 0 : "The interest rate can't be negative";
        this.interestRate = interestRate;
    }

    public void giveInterest() {
        //double, because we might get an interest below 1 cent
        final double interest = (getAccountBalance() * interestRate) / 1000.0;
        //rounding down - for the benefit of the bank
        //and casting to long, because deposit() expects a long
        final long roundedInterest = (long) Math.floor(interest);
        deposit(roundedInterest);
    }

    public int getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return String.format("[<%s>: interestRate=%d, %s]", SavingsAccount.class.getSimpleName(), interestRate, super.toString());
    }    

}
