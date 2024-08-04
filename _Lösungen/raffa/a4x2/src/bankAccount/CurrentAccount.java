package bankAccount;

/**
 * CurrentAccount
 * 
 * @author   Raffael Apitz & Frithjof Beims
 * @version  03.06.2024
 *
 */
public class CurrentAccount extends BankAccount {

    private int standardFee;

    public CurrentAccount(String id, int standardFee) {
        this(id, 0, standardFee);
    }

    public CurrentAccount(String id, long startingBalance, int standardFee) {
        super(id, startingBalance);
        assert standardFee >= 0 : "The standard fee can't be negative";
        this.standardFee = standardFee;
    }

    @Override
    public void withdraw(long amount) {
        super.withdraw(amount + standardFee);
    }

    public int getFee() {
        return standardFee;
    }

    @Override
    public String toString() {
        return String.format("[<%s>: standardFee=%d, %s]", CurrentAccount.class.getSimpleName(), standardFee, super.toString());
    }

}
