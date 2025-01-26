package zad1;

public class Apartment {
    private String location;
    private String category;
    private double price;

    public Apartment(String location, String category, double price) {
        this.location = location;
        this.category = category;
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void description() {
        System.out.println("Apartment located in " + location + ", Category: " + category + ", Price: $" + price);
    }
}
