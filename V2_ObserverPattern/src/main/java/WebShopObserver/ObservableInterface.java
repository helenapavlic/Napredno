package WebShopObserver;

public interface ObservableInterface {
    void addToAvailList(Customer customer);

    void removeFromAvailList(Customer customer);

    void notifyCustomers();
}
