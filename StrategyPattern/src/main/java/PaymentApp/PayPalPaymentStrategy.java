package PaymentApp;

public class PayPalPaymentStrategy implements PaymentStrategy{
    @Override
    public String performPayment(float priceToPay) {
        return STR."Processing payment via PayPal... price to pay: \{priceToPay}";
    }
}
