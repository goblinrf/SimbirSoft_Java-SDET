package lection1.СhildVehicle;

import lection1.AbstractClass.Vehicle;
import lection1.Interface.Drivable;
import lection1.Interface.Loadable;

public class Truck extends Vehicle implements Drivable, Loadable {
    private int loadCapacity;
    private int currentLoad;
    private boolean engineRunning;

    public Truck(String brand, String model, int year, int loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
        this.currentLoad = 0;
        this.engineRunning = false;
    }

    @Override
    public void startEngine() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("Truck engine started.");
        } else {
            System.out.println("Truck engine is already running.");
        }
    }

    @Override
    public void stopEngine() {
        if (engineRunning) {
            engineRunning = false;
            System.out.println("Truck engine stopped.");
        } else {
            System.out.println("Truck engine is already off.");
        }
    }

    @Override
    public void load(int weight) {
        if (currentLoad + weight <= loadCapacity) {
            currentLoad += weight;
            System.out.println(weight + " kg loaded. Current load: " + currentLoad + " kg.");
        } else {
            System.out.println("Cannot load " + weight + " kg. Over capacity!");
        }
    }

    @Override
    public void unload() {
        System.out.println("Unloading " + currentLoad + " kg.");
        currentLoad = 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck: " + getBrand() + " " + getModel() + " (" + getYear() + "), Capacity: " + loadCapacity + " kg, Current load: " + currentLoad + " kg.");
    }
}
