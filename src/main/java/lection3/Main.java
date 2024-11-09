package lection3;

import lection3.Interface.Functional.DiscriminantCalculator;
import lection3.Interface.Functional.DivisibilityChecker;
import lection3.СhildVehicle.Car;
import lection3.СhildVehicle.Truck;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        Car<Integer> car = new Car("Toyota", 44, 2020, 5);
        Truck truck = new Truck("Volvo", "FH16", 2018, 10000);

        car.ShowType();

        truck.load(5000);
        truck.load(6000);
        truck.ShowType();

        DivisibilityChecker divisibleBy13 = number -> number % 13 == 0;
        System.out.println(divisibleBy13.isDivisibleByThirteen(SCANNER.nextInt()));

        DiscriminantCalculator discriminant = (a, b, c) -> b * b - 4 * a * c;
        System.out.println("Дискриминант: " + discriminant.calculate(1.12, 3, 4.5));
    }

}
