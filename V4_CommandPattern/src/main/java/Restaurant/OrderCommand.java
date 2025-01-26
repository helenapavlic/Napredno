package Restaurant;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderCommand implements InterfaceCommand{
    private static int cntId = 1;
    private int id;
    private HashMap<FoodCategory, ArrayList<Food>> orders;
    private int tableNumber;
    private Chef chef;

    public OrderCommand(Chef chef, int tableNumber, HashMap<FoodCategory, ArrayList<Food>> orders) {
        this.id = cntId++;
        this.orders = orders;
        this.tableNumber = tableNumber;
        this.chef = chef;
    }

    public void executeOrder() {
        System.out.println("<<<<< [Table: " + tableNumber + "] >>>>>");
        chef.analyzeOrder();
        chef.collectFoodStaff(orders);
        chef.preparingFood(orders);
        System.out.println("****************************************");
    }

    public void undoOrder() {
        chef.stopAndRecall();
    }
}
