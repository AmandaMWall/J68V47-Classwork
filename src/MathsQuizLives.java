import java.util.Scanner;

public class MathsQuizLives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lives = 3;
        int questions = 0;
        int ans;

        while (lives > 0 && questions < 10) {
            System.out.print("How much is 100 + 100?: ");
            ans = input.nextInt();

            if (ans != 200) {
                System.out.println("You absolute disappointment, you lost a life.");
                lives -= 1;
            }

            questions += 1;
        }

        System.out.format("Lives: %d\n", lives);

        if (lives == 3) {
            System.out.println("Well done!");
        }
    }
}
