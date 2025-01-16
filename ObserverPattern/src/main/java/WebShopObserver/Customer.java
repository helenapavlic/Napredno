package WebShopObserver;

public class Customer implements CustomerObserverInterface{
    private String userName;
    private int id;
    private static int cntId = 1;

    public Customer(String userName) {
        this.userName = userName;
        this.id = cntId++;
    }


    @Override
    public void update(Item item, String storeName) {
        System.out.println("Notification for customer: ");
        System.out.println(toString());

        System.out.println("****************** " + storeName + " *********************");

        System.out.println("Item: " + item.toString());
        System.out.println("Is now available in our store....");

        System.out.println("////////////////////////////////////////////////////////////\n");

    }

    @Override
    public String toString() {
        return "Customer{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }
}
