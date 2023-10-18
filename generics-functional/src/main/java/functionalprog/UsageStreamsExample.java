package functionalprog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsageStreamsExample {

    public static void main(String[] args) {

        List<Double> hwScores = Arrays.asList(1.3,2.2,3.0,2.5,1.8,2.0);

        System.out.println("************** Using filter **************");
        // 1. Use filter to return only the numbers greater than 2
        Stream<Double> stream = hwScores.stream();
        hwScores = stream.filter( x -> x >= 2.0).collect(Collectors.toList());
        System.out.println(hwScores);


        System.out.println("************** Using map **************");
        // 2. Use map to build a new array that shows how far the student
        // was from getting a 3.0.
        Stream<Double> stream2 = hwScores.stream();
        Double[] difference = stream2.map( x -> 3.0 -x).toArray( x -> new Double[x]);
        System.out.println(Arrays.toString(difference));

        System.out.println("************** Using reduce **************");
        // 3. Use reduce to add up all the scores.
        Double sum = hwScores.stream().reduce(0.0, (total,x) -> total + x );
        System.out.println(sum);

        System.out.println("************* Several operations at once **************");
        // 4. Use the following list, take the absolute value of all the numbers and add them up:
        List<Integer> measurements = Arrays.asList(-3,-4,-3,15, 0);
        int measurementsSum = measurements.stream().map( x -> Math.abs(x)).reduce(0, (total,x) -> total + x);
        System.out.println(measurementsSum);

    }
}
