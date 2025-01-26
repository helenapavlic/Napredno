package zad1;

public class BookingServiceImpl implements BookingService{
    @Override
    public void book(Apartment apartment, User user) {
        System.out.println("Booking made for " + user.getName() + " at apartment in " + apartment.getLocation());
    }

    @Override
    public void cancel(Apartment apartment, User user) {
        System.out.println("Booking canceled for " + user.getName() + " at apartment in " + apartment.getLocation());
    }
}
