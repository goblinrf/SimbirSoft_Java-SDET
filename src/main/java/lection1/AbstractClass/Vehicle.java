package lection1.AbstractClass;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    private static int vehicleCount = 0;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        vehicleCount++;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void displayInfo();
}

