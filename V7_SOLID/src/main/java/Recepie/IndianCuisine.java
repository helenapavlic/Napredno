package Recepie;

public class IndianCuisine implements IndianRecipe, CommonRecipeFeatures{
    @Override
    public void generateIndianRecipe() {
        System.out.println("Generating an Indian recipe: Butter Chicken...");
    }

    @Override
    public void provideAdditionalInfo() {
        System.out.println("Indian cuisine often features a variety of spices.");
    }

    @Override
    public void recommendWebSources() {
        System.out.println("Recommended source: indianrecipes.com");
    }
}
