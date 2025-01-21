package PaymentService;

public class Client {
    public static void main(String[] args) {

        float amnt = (float) 250.50;

        CheckingAccount chAcc = new CheckingAccount("Sandra", 125);
        MobileAppInvoker mobApp = new MobileAppInvoker();
        mobApp.performTransaction(new DepositMoney(chAcc, amnt));
        mobApp.undoLastTransaction();
        mobApp.undoLastTransaction();
        mobApp.undoLastTransaction();
        mobApp.redoLastTransaction();
    }
}
