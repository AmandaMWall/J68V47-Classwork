import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L11E3 {
    public static void main(String[] args) {
                try {
            File out = new File("nums.txt");
            Scanner reader = new Scanner(out);
            int sum = 0;

            while (reader.hasNextLine()) {
                String data = reader.nextLine();

                // Assume there are only valid integers
                sum += Integer.parseInt(data);
            }

            System.out.println(sum);
            
            reader.close();
            } catch (FileNotFoundException e) {
            System.out.println("An error occurred." + e.toString());
            e.printStackTrace();
            }
        }  
}
