import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: £");
        float loan = input.nextFloat();
        System.out.print("Interest Rate (APR %): ");
        float interest = input.nextFloat();
        System.out.print("Number of years: ");
        float years = input.nextFloat();
        interest = (interest / 100) / 12;

        double power = Math.pow((1 + interest), (years * 12) - (years * 24));
        float ans = loan * (interest / (1 - (float) power));
        System.out.format("£%.2f", ans);
    }
}
