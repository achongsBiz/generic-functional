package genericprog;

public class Foo {

    public  <T> void printArray(T input []) {

        for(int i=0; i < input.length; i++) {
            System.out.println((i+1) + ") " + input[i]);
        }
    }
}
