package Game;

public class SecondRangKnightDecorator extends AbstractKnight implements KnightDecorator {
    AbstractKnight abstractKnight;


    public SecondRangKnightDecorator(AbstractKnight abstractKnight) {
        this.abstractKnight = abstractKnight;
        this.name = abstractKnight.name;
        this.powerLevel = abstractKnight.getPowerLevel() + 10;
    }


    @Override
    public void attack() {
        System.out.println("This knight can attack with even more weapons!");

    }

    @Override
    public int getPowerLevel() {
        return powerLevel;
    }

    @Override
    public void avoidBattle() {
        System.out.println("To avoid battle, this knight can run and jump over obstacles!");

    }

    @Override
    public void description() {
        System.out.println(getClass().getSimpleName() + " is secound class knight in this game!");
    }

    @Override
    public void setKnightToDecorate(AbstractKnight abstractKnight) {
        this.abstractKnight = abstractKnight;
        this.name = abstractKnight.name;
        this.powerLevel = abstractKnight.getPowerLevel() + 10;
    }


}
