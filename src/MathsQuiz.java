import java.util.Random;
import java.util.Scanner;

public class MathsQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int correct = 0;

        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(13);
            int b = rand.nextInt(13);

            System.out.format("%d + %d: ", a, b);
            int ans = input.nextInt();

            if (ans == (a + b)) {
                correct += 1;
            }
        }

        System.out.format("%d correct answers", correct);
    }
}
