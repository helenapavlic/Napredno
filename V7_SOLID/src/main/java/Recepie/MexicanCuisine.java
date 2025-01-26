package Recepie;

public class MexicanCuisine implements MexicanRecipe, CommonRecipeFeatures{
    @Override
    public void generateMexicanRecipe() {
        System.out.println("Generating a Mexican recipe: Tacos...");
    }

    @Override
    public void provideAdditionalInfo() {
        System.out.println("Mexican cuisine is famous for its use of chili peppers.");
    }

    @Override
    public void recommendWebSources() {
        System.out.println("Recommended source: mexicanrecipes.com");
    }
}
