package cars;

public class Car {
    private String make;
    private int price;
    private Car next;

    public Car(String m, int p, Car n) {
        this.make=m;
        this.price=p;
        this.next=n;
    }
    public Car(String make, int price) {
        this.make=make;
        this.price=price;
        this.next=null;
    }
    public String getMake() {
        return make;
    }
    public int getPrice() {
        return price;
    }
    public Car getNext() {
        return next;
    }
    public void showCars() {
        System.out.print(this);
    }
    public void showCarsRev() {
        System.out.print(this);
    }
    public String toString() {
        return make+" "+price;
    }
}
