import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner floatInput = new Scanner(System.in);
        System.out.print("Total value of order: ");
        float total = floatInput.nextFloat();

        if (total < 50) {
            System.out.println("Shipping cost is = £10.00");
            total += 10;
        }

        System.out.format("Final total £%.2f", total);
    }
}
