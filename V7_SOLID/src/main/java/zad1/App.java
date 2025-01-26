package zad1;

public class App {
    public static void main(String[] args) {

        // Create a user
        User user = new User("Alice", 1);

        // Create apartments
        Apartment apartment1 = new Apartment("New York", "A", 1200);
        Apartment apartment2 = new Apartment("Los Angeles", "B", 800);

        // Initialize services
        BookingService bookingService = new BookingServiceImpl();
        PaymentService paymentService = new PaymentServiceImpl();
        CategoryService categoryService = new CategoryServiceImpl();

        // User actions
        user.makeBooking(bookingService, apartment1);
        user.makePayment(paymentService, apartment1.getPrice());
        System.out.println("Apartment category: " + categoryService.categorize(apartment1));

        user.makeBooking(bookingService, apartment2);
        user.makePayment(paymentService, apartment2.getPrice());
        System.out.println("Apartment category: " + categoryService.categorize(apartment2));
    }

}
