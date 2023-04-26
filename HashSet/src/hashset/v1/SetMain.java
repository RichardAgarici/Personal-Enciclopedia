package hashset.v1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("There are " + squares.size() + " and there are " +
                cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements");
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("intersection contains " + intersection.size() + " elements");
        for (int i : intersection) {
            System.out.println(i + " this is square of " + Math.sqrt(i) + " and the cubes of " + Math.cbrt(i));
        }
        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }


        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] arrayNatureWords = {"all","nature","is","but","art","unknown","to","thee"};
        nature.addAll(Arrays.asList(arrayNatureWords));

        String[] divineWords = {"to","err","is","human","to","forgive","divine"};
        divine.addAll(Arrays.asList(divineWords));

    }
}
