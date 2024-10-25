package car;

public class Car implements Drivable {
    String brand;
    String model;
    String manufacturedYear;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    @Override
    public void start() {
        System.out.println("Start driving");
    }

    @Override
    public void stop() {
        System.out.println("Stop driving");

    }

    @Override
    public void drive(int distance) {
        System.out.println("Driving " + distance + " km");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufacturedYear='" + manufacturedYear + '\'' +
                '}';
    }
}
