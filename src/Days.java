import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int num = input.nextInt();

        if (num > 7 || num < 1) {
            System.out.println("You need to enter a number between 1 and 7.");
            System.exit(1);
        }

        System.out.println(days[num-1]);
    }
}
