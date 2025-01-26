package MagazineObserver;

public class MagazineSubscriber implements Subscriber{
    private String name;

    public MagazineSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String magazineName) {
        System.out.println("Subscriber " + name + " received a new issue from " + magazineName + "!");
    }

    @Override
    public String toString() {
        return "MagazineSubscriber{" +
                "name='" + name + '\'' +
                '}';
    }
}
