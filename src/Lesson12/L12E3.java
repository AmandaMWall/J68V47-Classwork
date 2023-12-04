package Lesson12;
import Lesson12.Car;

public class L12E3 {
    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.make = "Ferrari";
        ferrari.model = "F430";
        ferrari.year = 2009;
        ferrari.vin = "3GYVKNEFXAG625569";
        ferrari.price = 55125;
        ferrari.colour = "White";
        ferrari.mileage = "45336";
        ferrari.condition = "Good";

        System.out.println("--------------------------------------");
        System.out.format("%s %s (%d)\n", ferrari.make, ferrari.make, ferrari.year);
        System.out.format("Vin: %s\n", ferrari.vin);
        System.out.format("Colour: %s\n", ferrari.colour);
        System.out.format("Mileage: %s\n", ferrari.mileage);
        System.out.format("Condition: %s\n", ferrari.condition);
        System.out.format("Price %d\n", ferrari.price);
        System.out.println("--------------------------------------");
    }
}
