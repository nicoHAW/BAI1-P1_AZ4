package bankAccount;

/**
 * TransferManager
 * 
 * @author   Raffael Apitz & Frithjof Beims
 * @version  03.06.2024
 *
 */
public class TransferManager {

    //transfer money from one CurrentAccount to another
    public void transfer(CurrentAccount fromCurrAcc, CurrentAccount toCurrAcc, long amount) {
        assert amount > 0 : "Der zu überweisende Betrag sollte größer als 0 sein";
        assert fromCurrAcc != null : "The source current account is null";
        assert toCurrAcc != null : "The target current account is null";
        fromCurrAcc.withdraw(amount);
        toCurrAcc.deposit(amount);
    }

}
