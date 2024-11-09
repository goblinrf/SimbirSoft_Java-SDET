package lection3.СhildVehicle;

import lection3.AbstractClass.Vehicle;
import lection3.Interface.Vehicle.Drivable;

public class Car<T> extends Vehicle implements Drivable {
    private int passengerCapacity;
    private boolean engineRunning;
    private int currentPassenger;

    public Car(String brand, T model, int year, int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
        this.engineRunning = false;
        this.currentPassenger = 0;
    }

    @Override
    public void startEngine() {
        if (!engineRunning) {
            engineRunning = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    @Override
    public void stopEngine() {
        if (engineRunning) {
            engineRunning = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already off.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + getBrand() + " " + getModel() + " (" + getYear() + "), Passengers: " + passengerCapacity);
    }

    public void loadPassengers(int passengers) {
        if (passengers + currentPassenger <= passengerCapacity) {
            currentPassenger += passengers;
            System.out.println(passengers + " passengers loaded.");
        } else {
            System.out.println("Not enough space for all passengers.");
        }
    }

    public void unloadPassengers() {
        currentPassenger = 0;
        System.out.println("All passengers unloaded.");
    }
}
