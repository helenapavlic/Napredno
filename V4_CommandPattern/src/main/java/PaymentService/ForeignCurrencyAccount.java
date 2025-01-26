package PaymentService;

public class ForeignCurrencyAccount extends Account{


    public ForeignCurrencyAccount(String name){
        this.id = cnt++;
        this.accountBalance = 100.0f;
        this.name = name;
    }
    @Override
    public void setAmount(float amount) {

    }

    @Override
    public float getAmount(float amount) {
        return 0;
    }

    @Override
    public String toString() {
        return "ForeignCurrencyAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountBalance=" + accountBalance +
                ", amount=" + amount +
                '}';
    }
}
