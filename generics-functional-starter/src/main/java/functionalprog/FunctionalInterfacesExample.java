package functionalprog;

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


        // Give the consumer a String


        // Give the consumer the weight of the second Animal Object

        System.out.println("*************** Using a Predicate ***************");
        // Make a Predicate that checks to see if a number is even


        // Give the predicate a number


        // Make a Predicate that checks to see if an animal is dangerous. A
        // dangerous animal can climb and swim.

        System.out.println("*************** Using a Comparator ***************");
        // Make a Comparator that calculates the difference between two numbers


        // Give the comparator two numbers


        // Give the Comparator the weight of the first and second animal

    }

}
