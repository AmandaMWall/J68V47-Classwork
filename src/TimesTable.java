import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Base number: ");
        int base = input.nextInt();

        for (int i = 1; i < 13; i++) {
            System.out.format("%d x %d = %d\n", base, i, base * i);
        }
    }
}
