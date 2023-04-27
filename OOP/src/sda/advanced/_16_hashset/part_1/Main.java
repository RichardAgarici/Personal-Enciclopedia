package sda.advanced._16_hashset.part_1;

import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    Set<Integer> numbers = new HashSet<>();

    System.out.println(numbers.add(2));
    System.out.println(numbers.add(5));
    System.out.println(numbers.add(3));
    System.out.println(numbers.add(2));

    System.out.println("HashSet: " + numbers);
    
    System.out.println(numbers.remove(5));

    System.out.println("HashSet: " + numbers);
    
    
    Set<String> commonNames = new HashSet<>();
    
    commonNames.add("Ion");
    commonNames.add("Andrei");
    commonNames.add("Cristiano");
    commonNames.add("Ana");
    commonNames.add("Maria");
    commonNames.add("Andreea");
    commonNames.add("Andrei");

    System.out.println(commonNames);

    System.out.println(commonNames.contains("Ana"));
  }

}
