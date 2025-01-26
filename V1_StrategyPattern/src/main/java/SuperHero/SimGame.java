package SuperHero;

public class SimGame {
    public static Hero hero;
    public static void main(String[] args) {
        hero = new Hero();
        hero.setAbilityStrategy(new FastRunningStrategy());
        hero.toString();

    }
}
