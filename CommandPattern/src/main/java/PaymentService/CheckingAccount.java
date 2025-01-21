package PaymentService;

public class CheckingAccount extends Account {

    public CheckingAccount(String name, float initAmount) {
        this.name = name;
        cnt = 100;
        this.id = cnt;
        cnt++;
        this.accountBalance = initAmount;
    }

    @Override
    public void setAmount(float amnt) {
        System.out.println(this.getClass().getSimpleName() + " specific way of depositing money...");
        this.amount = amnt;
        this.accountBalance = this.accountBalance + amount;

    }

    @Override
    public float getAmount(float amnt) {
        if (accountBalance >= amnt) {
            accountBalance = accountBalance - amnt;
            return amnt;
        } else if (accountBalance != 0) {
            accountBalance = 0;
            return accountBalance;
        } else {
            System.out.println("Balance is equal to zero -> unable to finish transaction!!!!");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount [id=" + id + ", name=" + name + ", accountBalance=" + accountBalance + "]";
    }

}
