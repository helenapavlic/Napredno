package PaymentApp;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public String performPayment(float priceToPay) {
        return STR."Costumer needs to pay using cash... price to pay: \{priceToPay}";
    }
}
