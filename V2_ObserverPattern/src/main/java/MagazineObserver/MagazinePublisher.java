package MagazineObserver;

import java.util.ArrayList;
import java.util.List;

public class MagazinePublisher implements Publisher{

    private String magazineName;
    private List<Subscriber> subscribers;

    public MagazinePublisher(String magazineName) {
        this.magazineName = magazineName;
        subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)){
            subscribers.add(subscriber);
            System.out.println("Subscriber" + subscriber +" added! ");
        } else {
            System.out.println("subscriber is already added! " + subscriber);
        }
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        if (subscribers.contains(subscriber)){
            subscribers.remove(subscriber);
            System.out.println(subscriber + " is removed from list of subscribers!");
            System.out.println(subscribers.toString());
        } else {
            System.out.println(subscriber + " is not on the list! ");
            System.out.println(subscribers.toString());
        }

    }

    @Override
    public void notifyAllSubscribers() {
        for (Subscriber subscriber:subscribers){
            subscriber.update(magazineName);
        }
    }

    public void releaseNewIssue(){
        System.out.println("Publisher: " + magazineName + " released a new issue! ");
        notifyAllSubscribers();
    }

    @Override
    public String toString() {
        return "MagazinePublisher{" +
                "magazineName='" + magazineName + '\'' +
                ", subscribers=" + subscribers +
                '}';
    }
}
