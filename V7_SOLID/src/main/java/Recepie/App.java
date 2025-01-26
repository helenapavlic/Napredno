package Recepie;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<CommonRecipeFeatures> modules = new ArrayList<>();
        modules.add(new MediterraneanCuisine());
        modules.add(new ChineseCuisine());
        modules.add(new MexicanCuisine());
        modules.add(new IndianCuisine());

        for (CommonRecipeFeatures module : modules) {
            module.provideAdditionalInfo();
            module.recommendWebSources();

            if (module instanceof MediterraneanRecipe mediterranean) {
                mediterranean.generateMediterraneanRecipe();
            } else if (module instanceof ChineseRecipe chinese) {
                chinese.generateChineseRecipe();
            } else if (module instanceof MexicanRecipe mexican) {
                mexican.generateMexicanRecipe();
            } else if (module instanceof IndianRecipe indian) {
                indian.generateIndianRecipe();
            }
        }
    }
}
