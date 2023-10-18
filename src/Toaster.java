import java.util.Scanner;

public class Toaster {
    public static void main(String[] args) {
        Scanner floatInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = strInput.nextLine();
        System.out.print("Last name: ");
        String lastName = strInput.nextLine();

        System.out.print("Total value of order: ");
        float total = floatInput.nextFloat();

        System.out.print("Deposit: ");
        float deposit = floatInput.nextFloat();

        System.out.println("== RECEIPT ==");
        System.out.format("Customer: %s\n", firstName.charAt(0) + " " + lastName);
        System.out.format("Order Total: £%.2f\n", total);
        System.out.format("Deposit paid: £%.2f\n", deposit);
        System.out.format("Remainder: £%.2f\n", total - deposit);

        if (deposit >= 100) {
            System.out.println("You get a free toaster!");
        } else {
            System.out.println("You don't deserve a free toaster...");
        }

        System.out.println("Have a nice day!");
    }
}
