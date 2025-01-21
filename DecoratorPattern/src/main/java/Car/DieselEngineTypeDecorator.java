package Car;

public class DieselEngineTypeDecorator extends AbstractCarPackage implements CarDecorator{
    AbstractCarPackage car;
    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void description() {
        System.out.println("Customer decided to add diesel engine type to this car!");
    }

    @Override
    public void setCarToDecorate(AbstractCarPackage abstractCarPackage) {
        this.car = abstractCarPackage;
        this.engineType = "Diesel";
        this.price = abstractCarPackage.getPrice() + 1000.0f;
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
