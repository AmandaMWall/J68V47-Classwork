import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class L11E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();

        FileWriter out = null;

        try {
            out = new FileWriter("file.txt");

            for (int i = 1; i < 13; i++) {
                out.write(String.format("%d x %d = %d\n", i, num, i*num));
            }
        } catch (IOException e) {
            System.out.println("There was an error writing to the file: " + e.toString());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ce) {
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
        }
    }
}