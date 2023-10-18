import java.util.Scanner;

public class Usernames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = input.nextLine();
        System.out.print("Enter your surname: ");
        String last = input.nextLine();
        System.out.print("Enter your year of birth (ex. 2000): ");
        String year = input.nextLine();

        String username = first.charAt(0) + last.toLowerCase();
        String password = last.substring(0, 1).toLowerCase() + first.substring(0, 3).toUpperCase() + year;
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
