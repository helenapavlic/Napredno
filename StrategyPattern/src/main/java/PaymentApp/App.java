package PaymentApp;

public class App {
    public static void main(String[] args) {

        SimpleWebShop simpleWebShop = new SimpleWebShop();
        simpleWebShop.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println(simpleWebShop.performPayment(12.59F));
        simpleWebShop.display();

        System.out.println("--------------");
        simpleWebShop.setPaymentStrategy(new CashPaymentStrategy());
        System.out.println(simpleWebShop.performPayment(25.66F));
        simpleWebShop.display();

        System.out.println("--------------");
        simpleWebShop.setPaymentStrategy(new PayPalPaymentStrategy());
        System.out.println(simpleWebShop.performPayment(135.00F));
        simpleWebShop.display();


    }
}
