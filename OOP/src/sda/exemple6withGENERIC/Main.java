package sda.exemple6withGENERIC;

import java.util.List;

/**
 * Design the Joiner class, which in the constructor will take a separator (string) and have a join() method that allows you to specify any number of T-type objects.
 * This method will return a string joining all passed elements by calling their toString() method and
 * separating them with a separator. eg. for Integers and separator "-" it should return: 1-2-3-4
 */
public class Main {

    public static void main(String[] args) {
        Joiner <Integer> joinerInteger = new Joiner<>("-");

        System.out.println(joinerInteger.join(List.of(1,2,3,4,5)));

        Joiner<String> stringJoiner = new Joiner<>("+");

        System.out.println(stringJoiner.join(List.of("as","222", "fg")));
    }

}
