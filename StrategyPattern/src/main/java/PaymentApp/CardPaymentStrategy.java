package PaymentApp;

public class CardPaymentStrategy implements PaymentStrategy{
    @Override
    public String performPayment(float priceToPay) {
        return STR."Processing payment via credit Card... price to pay: \{priceToPay}";
    }
}
