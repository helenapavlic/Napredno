package Restaurant;

public class Food {
    private static int cntId = 1;
    private double price;
    private int id;
    private FoodName foodName;

    public Food(FoodName foodName, double price) {
        this.foodName = foodName;
        this.price = price;
        this.id = cntId++;
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                ", id=" + id +
                ", foodName=" + foodName +
                '}';
    }
}
