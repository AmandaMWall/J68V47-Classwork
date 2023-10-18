import java.util.Scanner;

public class ShortStory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your hobby: ");
        String hobby = input.nextLine();

        System.out.println(name + "'s hobby is " + hobby + "." +  "\n" + name +
                "enjoys their hobby as it is a way to de-stress." +
                "\n" + name + " wishes for their hobby of " + hobby + " to become more popular.");
    }
}
