package Restaurant;

import java.util.ArrayList;
import java.util.HashMap;

public class Chef {
    private String chefName;

    public Chef(String chefName) {
        this.chefName = chefName;
    }

    public void analyzeOrder() {
        System.out.println(chefName + " is analysing the order");
    }

    public void collectFoodStaff(HashMap<FoodCategory, ArrayList<Food>> all) {
        System.out.println(chefName + " -> collecting foodstuffs for: ");
        for(FoodCategory cat : all.keySet()) {
            System.out.println(cat);
            ArrayList<Food> food = all.get(cat);
            for(Food fd : food) {
                System.out.println(fd + " in this order...");
            }
        }
        System.out.println("\n");
    }

    public void preparingFood(HashMap<FoodCategory, ArrayList<Food>> all) {
        System.out.println(chefName + " -> preparing: ");
        for(FoodCategory cat : all.keySet()) {
            System.out.println(cat);
            ArrayList<Food> food = all.get(cat);
            for(Food fd : food) {
                System.out.println(fd);
            }
        }
        System.out.println("All is finished and can be served to guests.");
    }


    public void stopAndRecall() {

        System.out.println("Stop cooking and turn back all foodstaffs!!!");
    }
}
