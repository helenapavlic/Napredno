package Service;

public abstract class Master {
    protected String name;
    protected String description;

    public Master(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void bringTools() {
        System.out.println(name + " is bringing tools...");
    }

    protected String description() {
        return getClass().getSimpleName();
    }
}
