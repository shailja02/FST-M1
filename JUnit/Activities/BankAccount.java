package FST_Junit;

public class BankAccount {
    private Integer bal;


    public BankAccount(Integer initialBalance) {
        bal = initialBalance;
    }


    public Integer withdraw(Integer amount) {
        if (bal < amount) {
            throw new NotEnoughFundsException(amount, bal);
        }
        bal -= amount;
        return bal;
    }
}