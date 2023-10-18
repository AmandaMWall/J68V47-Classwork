import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number?: ");
        int firstNum = input.nextInt();

        System.out.print("What is the second number?: ");
        int secondNum = input.nextInt();

        System.out.format("%d + %d = %d\n", firstNum, secondNum, (firstNum + secondNum));
        System.out.format("%d - %d = %d\n", firstNum, secondNum, (firstNum - secondNum));
        System.out.format("%d * %d = %d\n", firstNum, secondNum, (firstNum * secondNum));
        System.out.format("%d / %d = %d\n", firstNum, secondNum, (firstNum / secondNum));
        System.out.format("%d %% %d = %d\n", firstNum, secondNum, (firstNum % secondNum));
        System.out.format("%d ^ %d = %f\n", firstNum, secondNum, Math.pow(firstNum, secondNum));
    }
}
