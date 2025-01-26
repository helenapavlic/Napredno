package Ships;

public class SailingPropulsion extends PropulsionSystem {
    public SailingPropulsion() {
        // Auto-generated constructor stub
    }

    @Override
    public void description() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SailinPropulsion [only on wind]";
    }
}
