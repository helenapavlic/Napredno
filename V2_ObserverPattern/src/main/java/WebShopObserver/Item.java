package WebShopObserver;

public class Item {
    private String itemName;
    private String itemCategory;

    public Item(String itemName, String itemCategory) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemCategory='" + itemCategory + '\'' +
                '}';
    }
}
