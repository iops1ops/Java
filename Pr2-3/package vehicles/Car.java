```
package vehicles;

public class  Car {
    public Car(String model, String license, String color, String ownerName, String insuranceNumber, int year, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = "Gasoline";
        this.year = year;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void Info() {
        System.out.println("Model: " + model);
        System.out.println("License: " + license);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Insurance nubmer: " + insuranceNumber);
        System.out.println("Engine type: " + engineType);
        System.out.println("Year: " + year);
    }
}
```
