```
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.license = "Неизвестно";
        this.color = color;
        this.year = year;
    }

    public Car(String license) {
        this.model = "Unknown";
        this.license = license;
        this.color = "Unknown";
        this.year = 0;
    }

    public void Info() {
    System.out.println("Модель: " + model);
    System.out.println("Номер: " + license);
    System.out.println("Цвет: " + color);
    System.out.println("Год выпуска: " + year);
    System.out.println();
    }

    public String toString() {
        return "Модель: " + model + "Номер: " + license + "Цвет: " + color + "Год выпуска: " + year;
    }
    public String To_String() {
        return toString();
    }

    public String getModel() {
        return model;
    }

    public String getLicense() {
        return license;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCarAge() {
        final int NOW_YEAR = 2024;
        return NOW_YEAR - this.year;
    }
}

public class Main {
    public static void main(String[] args) {
        final int now_year = 2024;
        Car car1 = new Car("Toyota Camry", "A777MP777", "Чёрный", 2015);
        car1.Info();
        System.out.println(car1.To_String());
        System.out.println("Возраст автомобиля: " + car1.getCarAge() + " лет");

        Car car2 = new Car("Lada Priora", "Баклажан", 2010);
        car2.Info();
        System.out.println(car2.To_String());
        System.out.println("Возраст автомобиля: " + car2.getCarAge() + " лет");

        Car car3 = new Car("E666KX77");
        car3.Info();
    }

}
```
