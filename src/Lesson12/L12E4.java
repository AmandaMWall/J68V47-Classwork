package Lesson12;

import Lesson12.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L12E4 {
    public static ArrayList<Car> loadCars(){
        List<String> carDetails;
        ArrayList<Car> cars = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("C<path>carSales.txt"));
            String line = in.readLine();

            while (line != null) {
                carDetails = Arrays.asList(line.split(","));

                Car newCar = new Car();
                newCar.make =  carDetails.get(0);
                newCar.model = carDetails.get(1);
                newCar.year = Integer.parseInt(carDetails.get(2));
                newCar.vin = carDetails.get(3);
                newCar.price = Integer.parseInt(carDetails.get(4));
                newCar.colour = carDetails.get(5);
                newCar.mileage = carDetails.get(6);
                newCar.condition = carDetails.get(7);

                cars.add(newCar);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return cars;
    }
    public static void main(String[] args) {
        ArrayList<Car> thisClass = loadCars();

        for (Car thisCar : thisClass) {
            System.out.println("--------------------------------------");
            System.out.format("%s %s (%d)\n", thisCar.make, thisCar.model, thisCar.year);
            System.out.format("Vin: %s\n", thisCar.vin);
            System.out.format("Colour: %s\n", thisCar.colour);
            System.out.format("Mileage: %s\n", thisCar.mileage);
            System.out.format("Condition: %s\n", thisCar.condition);
            System.out.format("Price %d\n", thisCar.price);
            System.out.println("--------------------------------------");
        }
    }
}
