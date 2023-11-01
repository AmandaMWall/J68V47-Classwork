import java.util.Arrays;

public class L8E3 {
    public static String[] insertItem(int index, String elem, String[] directions) {
        String[] arr = new String[directions.length + 1];
        int originalI = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = elem;
            } else {
                arr[i] = directions[originalI];
                originalI += 1;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        // Set up the directions array
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn left onto Elm Street.",
                "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
        };

        directions = insertItem(4, "After turning onto Elm Street, walk past the grocery store on your right.", directions);
        directions = Arrays.copyOf(directions, directions.length - 1);

        // Print out each direction
        int step = 1;
        for(String direction : directions) {
            System.out.format("%d. %s %n",step,direction);
            step ++;
        }
    }
}