package PaymentService;

public abstract class Account {
    protected int id;
    protected static int cnt;
    protected String name;
    protected float accountBalance;
    protected float amount;

    public float getAccountBalance() {
        return accountBalance;
    }

    public int getAccID() {
        return id;
    }

    public String getAccUserName() {
        return name;
    }

    public void setOldBalance(float amnt) {
        accountBalance = amnt;
    }

    public abstract void setAmount(float amnt);
    public abstract float getAmount(float amnt);
}
