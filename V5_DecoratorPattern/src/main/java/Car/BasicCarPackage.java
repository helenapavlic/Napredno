package Car;

public class BasicCarPackage extends AbstractCarPackage {

    public BasicCarPackage(String brand) {
        this.brand = brand;
        this.price = INITIAL_PRICE;
        this.additionalSafetyPackage = "/";
        this.additionalEquipment = "/";
        this.color = "/";
        this.seatCover = "/";
        this.engineType = "/";
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void description() {
        System.out.println("this is basic car package... future owner needs to add some elements to this package... ");
    }

    @Override
    public String toString() {
        return "BasicCarPackage{" +
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
