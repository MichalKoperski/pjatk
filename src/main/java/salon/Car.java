package salon;

public class Car {
    private String name;
    private String price;

    public Car(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
    public String toString() {
        return name + " " + price;
    }
}
