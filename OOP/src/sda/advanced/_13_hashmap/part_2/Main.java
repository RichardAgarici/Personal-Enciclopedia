package sda.advanced._13_hashmap.part_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {


  public static void main(String[] args) {


    Person p1 = new Person("Leo", "Messi", "1111", 35);
    Person p2 = new Person("Cristiano", "Ronaldo", "2222", 37);
    Person p3 = new Person("Mesut", "Ozil", "3333", 38);
    Person p4 = new Person("Cristi", "Tanase", "4444", 40);

    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);

    String searchName = "Mesut";

    for (Person pers : list) {
      if (pers.getFirstName().equals(searchName)) {
        System.out.println("FOUND ELEMENT: " + pers);
      }
    }

    HashMap<String, Person> personMap = new HashMap<>();

    personMap.put("Leo", p1);
    personMap.put("Cristiano", p2);
    personMap.put("Mesut", p3);
    personMap.put("Cristi", p4);


    Person found = personMap.get(searchName);

    System.out.println("ELEMENT IN MAP: " + found);

    System.out.println("----------------------------");
    

    // person is now the key and the value is a description of the player
    
    // when we use a custom class as a key in hashmap we NEED to override HASHCODE and EQUALS methods in that class
    HashMap<Person, String> otherPersonMap = new HashMap<>();
    

    otherPersonMap.put(p1, "Leo messi is a good football player.");
    otherPersonMap.put(p2, "Cristian is a good football player");
    otherPersonMap.put(p3, "Ozil is a good playmaker");
    otherPersonMap.put(p4, "Dodel de romania");
    
    Person otherObject = new Person("Cristiano", "Ronaldo", "2222", 37);

    System.out.println(otherPersonMap.get(otherObject));

  }
  
}
