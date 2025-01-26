package Recepie;

public class ChineseCuisine implements ChineseRecipe, CommonRecipeFeatures{
    @Override
    public void generateChineseRecipe() {
        System.out.println("Generating a Chinese recipe: Kung Pao Chicken...");
    }

    @Override
    public void provideAdditionalInfo() {
        System.out.println("Chinese cuisine often uses soy sauce, garlic, and ginger.");
    }

    @Override
    public void recommendWebSources() {
        System.out.println("Recommended source: chineserecipes.com");
    }
}
