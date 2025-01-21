package Car;

public class GasolineEngineTypeDecorator extends AbstractCarPackage implements CarDecorator{
    AbstractCarPackage car;
    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void description() {
        System.out.println("Customer decided to add gasoline engine type to this car!");
    }

    @Override
    public void setCarToDecorate(AbstractCarPackage abstractCarPackage) {
        this.car = abstractCarPackage;
        this.engineType = "Gas";
        this.price = abstractCarPackage.getPrice() + 1200.0f;
        this.brand = abstractCarPackage.brand;
    }

    @Override
    public String toString() {
        return "DieselEngineTypeDecorator{" +
                "INITIAL_PRICE=" + INITIAL_PRICE +
                ", brand='" + brand + '\'' +
                ", engineType='" + engineType + '\'' +
                ", color='" + color + '\'' +
                ", seatCover='" + seatCover + '\'' +
                ", additionalSafetyPackage='" + additionalSafetyPackage + '\'' +
                ", additionalEquipment='" + additionalEquipment + '\'' +
                ", price=" + price +
                '}';
    }
}
