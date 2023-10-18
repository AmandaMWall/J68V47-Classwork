import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        int guesses = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("You have 10 guesses");

        while (true) {
            System.out.print("Guess random num (whole number between 1 and 100): ");
            int guess = input.nextInt();

            if (num == guess) {
                System.out.println("You got it right!");
                break;
            } else if (num > guess) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }

            guesses -= 1;

            System.out.format("Guesses left: %d\n", guesses);

            if (guesses == 0) {
                System.out.println("You exceeded amount of guesses");
                break;
            }
        }

        System.out.format("The answer was: %d", num);
    }
}
