```
package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota Camry", "A777MP777", "Black", "Ivan Prokopev", "999-999-999", 2015, "");
        car1.Info();

        car1.setOwnerName("Vasiliy");
        System.out.println("New owner name: " + car1.getOwnerName());

        System.out.println("\n");

        ElectricCar electricCar1 = new ElectricCar("Tesla CyberTruck", "B777MP777", "White","Lena Smirnova" , "987-654-321", 2002, 50);
        electricCar1.Info();

        electricCar1.setColor("Black");
        System.out.println("New color: " + electricCar1.getColor());
        electricCar1.setBatteryCapacity(500);
        System.out.println("New Battery capacity: " + electricCar1.getBatteryCapacity());
    }
}

```
