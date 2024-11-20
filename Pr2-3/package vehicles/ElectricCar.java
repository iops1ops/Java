```
package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String model, String license, String color, String ownerName, String insuranceNumber, int year, int batteryCapacity) {
        super(model, license, color, ownerName, insuranceNumber, year, "Electric");
        this.batteryCapacity = batteryCapacity;
        this.engineType = "Electric";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
```
