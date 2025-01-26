package SuperHero;

public class Hero {
    AbilityStrategy abilityStrategy;

    public Hero() {
    }

    public void setAbilityStrategy(AbilityStrategy abilityStrategy) {
        this.abilityStrategy = abilityStrategy;
        abilityStrategy.applyAbility();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "abilityStrategy=" + abilityStrategy +
                '}';
    }
}
