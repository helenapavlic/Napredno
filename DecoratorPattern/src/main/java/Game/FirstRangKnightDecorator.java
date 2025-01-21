package Game;

public class FirstRangKnightDecorator extends AbstractKnight implements KnightDecorator {
    AbstractKnight abstractKnight;

    public FirstRangKnightDecorator(AbstractKnight abstractKnight) {
        this.abstractKnight = abstractKnight;
        this.name = abstractKnight.name;
        this.powerLevel = abstractKnight.getPowerLevel() + 10;
    }


    @Override
    public void attack() {
        System.out.println("This knight has knife and a sword!");

    }

    @Override
    public int getPowerLevel() {
        return powerLevel;
    }

    @Override
    public void avoidBattle() {
        System.out.println("this knight can avoid battle - he is fast walking away!");

    }

    @Override
    public void description() {
        System.out.println(getClass().getSimpleName() + " is first rang knight in this game!");
    }

    @Override
    public void setKnightToDecorate(AbstractKnight abstractKnight) {
        this.abstractKnight = abstractKnight;
    }

    @Override
    public String toString() {
        return "FirstRangKnightDecorator{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }
}
