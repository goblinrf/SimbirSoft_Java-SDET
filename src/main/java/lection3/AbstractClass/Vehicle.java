package lection3.AbstractClass;

public abstract class Vehicle<T> {
    private String brand;
    private T model;
    private int year;

    private static int vehicleCount = 0;

    public Vehicle(String brand, T model, int year) {
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

    public void ShowType() {
        System.out.println("Тип T " + model.getClass().getName());
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
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


