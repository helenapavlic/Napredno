package zad1;

public class User {
    private String name;
    private int id;
    private int cnt;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
        this.cnt = 0; // Number of bookings
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getCnt() {
        return cnt;
    }

    public void makeBooking(BookingService bookingService, Apartment apartment) {
        bookingService.book(apartment, this);
        cnt++;
    }

    public void makePayment(PaymentService paymentService, double amount) {
        paymentService.pay(amount, this);
    }
}


