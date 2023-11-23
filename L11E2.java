import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class L11E2 {
    public static void main(String[] args) {
        try {
            File out = new File("file.txt");
            Scanner reader = new Scanner(out);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            
            reader.close();
            } catch (FileNotFoundException e) {
            System.out.println("An error occurred." + e.toString());
            e.printStackTrace();
            }
        }  
}
