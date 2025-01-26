package Recepie;

public class MediterraneanCuisine implements MediterraneanRecipe, CommonRecipeFeatures{
    @Override
    public void generateMediterraneanRecipe() {
        System.out.println("Generating a Mediterranean recipe: Greek Salad...");
    }

    @Override
    public void provideAdditionalInfo() {
        System.out.println("Mediterranean cuisine is known for its healthy ingredients.");
    }

    @Override
    public void recommendWebSources() {
        System.out.println("Recommended source: mediterraneanrecipes.com");
    }
}
