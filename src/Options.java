import java.util.Scanner;
import java.time.LocalTime;

public class Options {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Say 'hello'");
            System.out.println("2. Tell me the time");
            System.out.println("3. Tell me a joke");
            System.out.println("4. Quit");
            int option = input.nextInt();

            switch (option) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.out.println(LocalTime.now());
                case 3 ->
                        System.out.println("There are 10 kinds of people in the world. Those who understand binary and those who don't.");
                case 4 -> {
                    System.exit(0);
                }
                default -> System.out.println("Please pick a valid option between 1 and 4");
            }
        }
    }
}
