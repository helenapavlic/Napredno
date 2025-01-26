package Car;

public abstract class AbstractCarPackage {
    protected final float INITIAL_PRICE = 10000.0f;
    protected String brand;
    protected String engineType;
    protected String color;
    protected String seatCover;
    protected String additionalSafetyPackage;
    protected String additionalEquipment;

    protected float price;

    public abstract float getPrice();
    public abstract void description();

    @Override
    public String toString() {
        return "AbstractCarPackage{" +
                "brand='" + brand + '\'' +
                ", engineType='" + engineType + '\'' +
                ", color='" + color + '\'' +
                ", seatCover='" + seatCover + '\'' +
                ", additionalSafetyPackage='" + additionalSafetyPackage + '\'' +
                ", additionalEquipment='" + additionalEquipment + '\'' +
                ", price=" + price +
                '}';
    }
}
