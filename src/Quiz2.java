import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans;

        System.out.print("Q1. What animal that begins with an \"H\" is lactose intolerant?: ");
        ans = input.nextLine();
        ans = ans.toLowerCase();
        if (!ans.equals("hedgehog")) {
            System.out.println("Sorry, the correct answer is hedgehog");
        }
        System.out.print("Q2. What animal glows under ultra-violet light?: ");
        ans = input.nextLine();
        ans = ans.toLowerCase();
        if (!ans.equals("platypus")) {
            System.out.println("Sorry, the correct answer is platypus");
        }

        System.out.print("Q3. What is the meaning of life?: ");
        ans = input.nextLine();
        if (!ans.equals("42")) {
            System.out.println("Sorry, the correct answer is 42");
        }

    }
}
