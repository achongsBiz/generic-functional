package functionalprog;

import java.util.Arrays;
import java.util.List;

public class UsageStreamsExample {

    public static void main(String[] args) {

        List<Double> hwScores = Arrays.asList(1.3,2.2,3.0,2.5,1.8,2.0);

        System.out.println("************** Using filter **************");
        // 1. Use filter to return only the numbers greater than 2

        System.out.println("************** Using map **************");
        // 2. Use map to build a new array that shows how far the student
        // was from getting a 3.0.

        System.out.println("************** Using reduce **************");
        // 3. Use reduce to add up all the scores.


        System.out.println("************* Several operations at once **************");
        // 4. Use the following list, take the absolute value of all the numbers and add them up:
        List<Integer> measurements = Arrays.asList(-3,-4,-3,15, 0);


    }
}
