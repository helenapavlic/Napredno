package MagazineObserver;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifyAllSubscribers();
}
