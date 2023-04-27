package sda.map.exemple2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ex 4
 * Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
 * Read the string from the command line.
 * Ex: {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(getCharactersPosition("HelloWorld"));

    }

    public static Map<Character, List<Integer>> getCharactersPosition(String input) {
        Map<Character, List<Integer>> positionByChar = new HashMap<>();

        for (int i = 0; i < input.toCharArray().length; i++) {
            char currentChar = input.toCharArray()[i];
            if (positionByChar.containsKey(currentChar)) {
                List<Integer> positionOfChar = positionByChar.get(currentChar);
                positionOfChar.add(i);
                positionByChar.put(currentChar , positionOfChar);
            } else {
                List<Integer> positionOfChar = new ArrayList<>();
                positionOfChar.add(i);
                positionByChar.put(currentChar , positionOfChar);
            }
        }
        return positionByChar;
    }
}