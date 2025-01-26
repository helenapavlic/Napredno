package Restaurant;

import java.util.ArrayList;
import java.util.HashMap;

public class AppCli {
    public static void main(String[] args) {
        Chef chef = new Chef("Paskvalina");
        WaiterInvoker waiter = new WaiterInvoker("Neno");
        HashMap<FoodCategory, ArrayList<Food>> info = new HashMap<FoodCategory, ArrayList<Food>>();
        ArrayList<Food> food1 = new ArrayList<Food>();
        ArrayList<Food> food2 = new ArrayList<Food>();
        food1.add(new Food(FoodName.food1, 22.45));
        food2.add(new Food(FoodName.food2, 55.43));
        food2.add(new Food(FoodName.food3, 22.45));
        food1.add(new Food(FoodName.food5, 11.21));
        info.put(new FoodCategory(EnumFoodCategory.Fish), food2);
        info.put(new FoodCategory(EnumFoodCategory.Fish), food1);
        waiter.setOrderCommand(new OrderCommand(chef, 10, info));
        waiter.setUpOrder();
    }
}
