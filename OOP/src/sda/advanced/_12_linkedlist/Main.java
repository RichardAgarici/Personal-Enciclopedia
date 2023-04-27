package sda.advanced._12_linkedlist;

import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {

    LinkedList<String> animals = new LinkedList<>();
    
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    animals.add("Bird");
    animals.add("Lion");
    animals.add("Sheep");

    System.out.println("Linkedlist: " + animals);
    
    String str = animals.get(1);

    System.out.println("Animal index 1: " + str);
    
//    animals.set(4, "Goat");
    animals.add(4, "Goat");

    System.out.println("Linkedlist: " + animals);
    
    
  }
  
}
