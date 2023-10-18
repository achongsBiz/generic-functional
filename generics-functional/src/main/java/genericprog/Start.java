package genericprog;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        /*
         * Part 1, Classes with Generic Properties
         *
         * */

        // 1. Make a Trio class containing three generic properties


        // 2. Instantiate a Trio, pick the data types you want
        Trio<Integer, String, Boolean> firstTrio = new Trio<>(5, "potato", false);
        System.out.println(firstTrio);

        // 3. Make another Trio object
        Trio<Double, Integer, String> secondTrio = new Trio<>(5.3, 7, "cat");
        System.out.println(secondTrio);

        // 4. Does this look familiar? Think Lists
        List<Integer> someList = new ArrayList<>();

        /*
        * Part 2, Using Generic Methods
        *
        * */

        // 1. Define a method in Foo that can print out an array of any data type.

        // 2. Make a Foo object, an array of Integers, and an array of Strings
        Foo foo = new Foo();
        Integer[] someNums = {9,3,2};
        String[] someStrings = {"bar", "baz", "taz"};

        // 3. Invoke the method with both arrays
        foo.printArray(someNums);
        foo.printArray(someStrings);

    }
}
