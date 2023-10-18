import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans;

        System.out.print("Q1. What animal that begins with an \"H\" is lactose intolerant?: ");
        ans = input.nextLine();
        System.out.println(ans.toLowerCase().contains("hedgehog"));
        System.out.print("Q2. What animal glows under ultra-violet light?: ");
        ans = input.nextLine();
        System.out.println(ans.toLowerCase().contains("platypus"));
        System.out.print("Q3. What is the meaning of life?: ");
        ans = input.nextLine();
        System.out.println(ans.toLowerCase().contains("42"));
    }
}
