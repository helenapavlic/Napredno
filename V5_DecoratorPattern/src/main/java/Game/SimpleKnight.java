package Game;

public class SimpleKnight extends AbstractKnight {

    public SimpleKnight(String name) {
        this.name = name;
        this.powerLevel = POWER;
    }

    @Override
    public void attack() {
        System.out.println("Can only attack with bare hands!");
    }

    @Override
    public int getPowerLevel() {
        return powerLevel;
    }

    @Override
    public void avoidBattle() {
        System.out.println("Better decide to avoid battle - remember that you can only walk...");

    }

    @Override
    public void description() {
        System.out.println(getClass().getSimpleName() + " is the zero level caracter in the game...");
    }

    @Override
    public String toString() {
        return "SimpleKnight{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }
}
