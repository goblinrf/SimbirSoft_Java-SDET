package lection1;

import lection1.AbstractClass.Vehicle;
import lection1.СhildVehicle.Car;
import lection1.СhildVehicle.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 5);
        Truck truck = new Truck("Volvo", "FH16", 2018, 10000);

        car.displayInfo();
        car.startEngine();
        car.loadPassengers(4);
        car.stopEngine();

        truck.displayInfo();
        truck.startEngine();
        truck.load(5000);
        truck.load(6000);
        truck.unload();
        truck.stopEngine();

        System.out.println("Total vehicles created: " + Vehicle.getVehicleCount());
    }
}
