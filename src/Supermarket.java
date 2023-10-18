import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner floatInput = new Scanner(System.in);

        System.out.print("Enter the name of item 1: ");
        String oneName = strInput.nextLine();

        System.out.print("Enter the price of item 1: ");
        Float onePrice = floatInput.nextFloat();

        System.out.print("Enter the name of item 2: ");
        String twoName = strInput.nextLine();

        System.out.print("Enter the price of item 2: ");
        Float twoPrice = floatInput.nextFloat();

        System.out.print("Enter the name of item 3: ");
        String threeName = strInput.nextLine();

        System.out.print("Enter the price of item 3: ");
        Float threePrice = floatInput.nextFloat();

        System.out.println("NESMART");
        System.out.format("%s..........£%.2f%n", oneName, onePrice);
        System.out.format("%s..........£%.2f%n", twoName, twoPrice);
        System.out.format("%s..........£%.2f%n", threeName, threePrice);
        System.out.format("Subtotal....£%.2f%n", onePrice + twoPrice + threePrice);
    }
}
