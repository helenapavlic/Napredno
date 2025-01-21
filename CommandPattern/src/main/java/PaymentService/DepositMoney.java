package PaymentService;

public class DepositMoney implements PaymentService {
    private Account account;
    private float oldBalance;
    private float amount;

    public DepositMoney(Account acc, float amnt) {
        account = acc;
        oldBalance = acc.getAccountBalance();
        this.amount = amnt;
    }

    @Override
    public void execute() {
        account.setAmount(amount);
        System.out.println(toString());

    }

    @Override
    public void undo() {
        if (account != null) {
            float temp = account.getAccountBalance();
            account.setOldBalance(oldBalance);
            oldBalance = temp;
        }
        System.out.println(toString());
    }

    @Override
    public void redo() {
        undo();

    }

    @Override
    public String toString() {
        return "DepositMoney [account=" + account + ", oldBalance=" + oldBalance + ", amount=" + amount + "]";
    }
}
