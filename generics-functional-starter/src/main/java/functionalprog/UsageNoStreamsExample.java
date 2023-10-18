package functionalprog;

import java.util.ArrayList;
import java.util.List;

public class UsageNoStreamsExample {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cow", 2000, false, false));
        animals.add(new Animal("Shark", 323, true, false));
        animals.add(new Animal("Hippo", 3000, true, false));
        animals.add(new Animal("Bear", 563, true, true));

        System.out.println("*************** Using removeIf ***************");

        // Remove animals from the list that cannot swim, removeIf requires
        // a predicate.


        System.out.println("*************** Using sort ********************");

        // Sort the remaining animals by weight in ascending order, sort requires
        // a comparator


        // Sort the remaining animals by weight in descending order

    }
}
