package PaymentApp;

public class SimpleWebShop extends WebShop{
    public SimpleWebShop() {
    }

    public SimpleWebShop(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    @Override
    protected void display() {
        System.out.println(STR."\{paymentStrategy.getClass().getSimpleName()} performed strategy! ");

    }
}
