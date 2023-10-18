import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of questions: ");
        int questions = input.nextInt();
        System.out.print("Enter amount of correct answers: ");
        int correct = input.nextInt();

        float percentage = ((float) correct / questions) * 100;

        if (percentage >= 70) {
            System.out.println("A");
        } else if (percentage >= 60) {
            System.out.println("B");
        } else if (percentage >= 50) {
            System.out.println("C");
        } else if (percentage >= 40) {
            System.out.println("D");
        } else {
            System.out.println("No award");
        }
    }
}
