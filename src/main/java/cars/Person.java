package cars;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Car> cars = new ArrayList<>();

    public Person(String name) {
        this.name=name;
    }
    public Person buys(String make, int price) {
        cars.add(new Car(make, price));
        return this;
    }
    public String getName() {
        return name;
    }
    public void showCars() {
        System.out.print(cars);
    }
    public void showCarsRev() {
        List<Car> carRev = new ArrayList<>();
        for(int a = cars.size()-1; a>=0; a--) {
            carRev.add(cars.get(a));
        }
        System.out.print(carRev);
    }
    public int getTotalPrice() {
        int totalPrice = 0;
        for(Car car:cars) {
            totalPrice+=car.getPrice();
        }
        return totalPrice;
    }
    public boolean hasCar(String make) {
        boolean has = false;
        for(Car car:cars) {
            if(make.equalsIgnoreCase(car.getMake())) {
                has = true;
            }
        }
        return has;
    }
    public Car mostExpensive() {
        int highestPrice = 0;
        String carMostExpensive="";
        for(Car car:cars) {
            if(highestPrice<car.getPrice()) {
                highestPrice=car.getPrice();
                carMostExpensive=car.getMake();
            }
        }
        return new Car(carMostExpensive, highestPrice);
    }
    public List<Car> getCars() {
        return cars;
    }
}
