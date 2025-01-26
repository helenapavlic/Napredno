package zad1;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public void pay(double amount, User user) {
        System.out.println("Payment of $" + amount + " made by " + user.getName());
    }
}
