package Game;

public abstract class AbstractKnight {
    protected String name;
    protected static final int POWER= 10;

    protected int powerLevel;

    public abstract void attack();
    public abstract int getPowerLevel();
    public abstract void avoidBattle();
    public abstract void description();

    @Override
    public String toString() {
        return name + " [powLevel=" + powerLevel + "]";
    }
}
