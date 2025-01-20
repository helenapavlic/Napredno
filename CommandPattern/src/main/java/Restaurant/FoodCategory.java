package Restaurant;

public class FoodCategory {
    private int id;
    private static int cntId = 1;

    private EnumFoodCategory enumFoodCategory;

    public FoodCategory(EnumFoodCategory enumFoodCategory) {
        this.enumFoodCategory = enumFoodCategory;
        this.id = cntId++;
    }

    @Override
    public String toString() {
        return "FoodCategory{" +
                "id=" + id +
                ", enumFoodCategory=" + enumFoodCategory +
                '}';
    }
}
