package WebShopObserver;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class OnlineStore implements ObservableInterface{
    private String storeName;
    private int storeId;

    private ArrayList<Customer> customers;
    private Item item;

    public OnlineStore(String storeName) {
        customers = new ArrayList<Customer>();
        this.storeName = storeName;
        this.storeId = ThreadLocalRandom.current().nextInt(100000);;
    }

    public void setItemAvailability(Item item){
        this.item = item;
    }
    @Override
    public void addToAvailList(Customer customer) {
        customers.add(customer);

    }

    @Override
    public void removeFromAvailList(Customer customer) {
        if (!customers.contains(customer)){
            System.out.println("there is no such customer");
        } else {
            customers.remove(customer);
        }

    }

    @Override
    public void notifyCustomers() {
        for (Customer customer : customers){
            customer.update(item,storeName);
        }
    }
}
