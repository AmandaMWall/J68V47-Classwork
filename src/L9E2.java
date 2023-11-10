import java.util.*;
import java.io.File;


public class L9E2 {

    public static void exception1() {
        // exception 1: dividing by zero
        try {
            int exception1 = 10 / 0;
            System.out.println(exception1);
        } catch (Exception e) {
            System.out.println("1: " + e.toString());
        }
    }

    public static void exception2() {
        // exception 2
        int exception2 = Integer.MAX_VALUE + 1;
    }

    public static void exception3() {
        // exception 3: out of bounds
        int[] myArray3 = new int[5];

        try {
            int exception3 = myArray3[5];
        } catch (Exception e) {
            System.out.println("3: " +  e.toString());
        }
    }

    public static void exception4() {
        // exception 4: myArray4 is null
        int[] myArray4 = null;

        try {
            int exception4 = myArray4[0];
        } catch (Exception e) {
            System.out.println("4: " + e.toString());
        }
    }

    public static void exception5() {
        // exception 5: cannot find exception5.txt
        File exception5 = new File("exception5.txt");

        try {
            Scanner scanner = new Scanner(exception5);
        } catch (Exception e) {
            System.out.println("5: " + e.toString());
        }
    }

    public static void exception6() {
        // exception 6: Cannot parse string as an integer
        String thisString = "Hello";

        try {
            int exception6 = Integer.parseInt(thisString);
        } catch (Exception e) {
            System.out.println("6: " + e.toString());
        }
    }

    public static void exception7() {
        // exception 7: exception7 is null so cant convert to upper case
        String exception7 = null;

        try {
            System.out.println(exception7.toUpperCase());
        } catch (Exception e) {
            System.out.println("7: " + e.toString());
        }
    }
    public static void main(String[] args) {
        exception1();
        exception2();
        exception3();
        exception4();
        exception5();
        exception6();
        exception7();

    }
}
