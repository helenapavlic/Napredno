package zad1;

public interface BookingService {
    void book(Apartment apartment, User user);
    void cancel(Apartment apartment, User user);
}
