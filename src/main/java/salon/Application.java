package salon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class Application {
    public static void main (String[] args) {
        String[] arr = {
                "salon A", "Mercedes", "130000",
                "salon B", "Mercedes", "120000",
                "salon C", "Ford", "110000",
                "salon B", "Opel", "90000",
                "salon C", "Honda", "95000",
                "salon A", "Ford", "105000",
                "salon A", "Renault", "75000"
        };
        String carCheap="";
        String salonCheap="";
        int temp = 100000000;
        Map<String,List<Car>> cars = new HashMap<>();
        List<Car> salonA = new ArrayList<>();
        List<Car> salonB = new ArrayList<>();
        List<Car> salonC = new ArrayList<>();

        for(int i=0; i<21; i++) {
           if(i%3==0) {
               if(arr[i].equalsIgnoreCase("salon A")) {
                   salonA.add(new Car(arr[i+1], arr[i+2]));
               }
                    cars.put("salon A", salonA);

               if(arr[i].equalsIgnoreCase("salon B")) {
                   salonB.add(new Car(arr[i+1], arr[i+2]));
               }
                    cars.put("salon B", salonB);

               if(arr[i].equalsIgnoreCase("salon C")) {
                   salonC.add(new Car(arr[i+1], arr[i+2]));
               }
               cars.put("salon C", salonC);
           }
        }
        System.out.println(cars);

        for(Map.Entry carsIn: cars.entrySet()) {
            for(int i=0; i<cars.get("salon A").size(); i++) {
                if(temp > parseInt(cars.get("salon A").get(i).getPrice())) {
                    temp = parseInt(cars.get("salon A").get(i).getPrice());
                    carCheap = cars.get("salon A").get(i).getName();
                    salonCheap="salon A";
                }
            }
            for(int i=0; i<cars.get("salon B").size(); i++) {
                if(temp > parseInt(cars.get("salon B").get(i).getPrice())) {
                    temp = parseInt(cars.get("salon B").get(i).getPrice());
                    carCheap = cars.get("salon B").get(i).getName();
                    salonCheap="salon B";
                }
            }
            for(int i=0; i<cars.get("salon C").size(); i++) {
                if(temp > parseInt(cars.get("salon C").get(i).getPrice())) {
                    temp = parseInt(cars.get("salon C").get(i).getPrice());
                    carCheap = cars.get("salon C").get(i).getName();
                    salonCheap="salon C";
                }
            }
        }
        System.out.println(carCheap+" in "+salonCheap+" "+temp);
    }
}