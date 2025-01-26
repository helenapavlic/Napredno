package SuperHero;

public class DoubleStrenghtStrategy implements AbilityStrategy{

    @Override
    public void applyAbility() {
        System.out.println("Ability -> " + getClass().getSimpleName());
    }
}
