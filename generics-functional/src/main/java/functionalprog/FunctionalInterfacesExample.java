package functionalprog;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfacesExample {

    public static void main(String[] args) {

        Animal [] animals = {
                new Animal("Cow", 2000, false, false),
                new Animal("Shark", 323, true, false),
                new Animal("Hippo", 3000, true, false),
                new Animal("Bear", 563, true, true),
        };


        System.out.println("*************** Using a Consumer ***************");
        // Make a Consumer that accepts a String and prints out its value
        Consumer<String> saySomething = x -> System.out.println(x);

        // Give the Consumer a String
        saySomething.accept("table");

        // Make a Consumer that accepts an Animal Object, print out its weight
        Consumer<Animal> howHeavy = x -> System.out.println(x.getWeight());
        howHeavy.accept(animals[2]);

        System.out.println("*************** Using a Predicate ***************");
        // Make a Predicate that checks to see if a number is even
        Predicate<Integer> isItEven = x -> x%2 == 0;

        // Give the predicate a number
        boolean result = isItEven.test(6);
        System.out.println(result);

        // Make a Predicate that checks to see if an animal is dangerous. A
        // dangerous animal can climb and swim.
        Predicate<Animal> isItDangerous = x -> x.isCanClimb() && x.isCanSwim();
        System.out.println( isItDangerous.test(animals[0]));
        System.out.println( isItDangerous.test(animals[3]));

        System.out.println("*************** Using a Comparator ***************");
        // Make a Comparator that calculates the difference between two numbers
        Comparator<Integer> comparator = (x, y) -> x-y;


        // Give the comparator two numbers
        System.out.println( comparator.compare(10,3) );

        // Give the Comparator the weight of the first and second animal
        Comparator<Animal> animalWeightCompare = (a,b) -> a.getWeight() - b.getWeight();
        System.out.println(animalWeightCompare.compare(animals[1], animals[0]));

    }

}
