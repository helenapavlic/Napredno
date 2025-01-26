package PaymentApp;

public abstract class WebShop {

    protected PaymentStrategy paymentStrategy;

    protected String performPayment(float price){
        return  paymentStrategy.performPayment(price);
    }

    protected abstract void display();

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
