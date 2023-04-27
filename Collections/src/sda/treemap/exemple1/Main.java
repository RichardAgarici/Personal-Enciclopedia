package sda.treemap.exemple1;

import java.util.Comparator;
import java.util.TreeMap;
/**
 * HashMap, nu are ordine.
 * TreeMap, are sortare implementata.
 */

/**
 * Create a method that accepts TreeMap and prints the first and last EntrySet in the console.
 */

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        TreeMap<String, String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap.put("BMW", "X6");
        treeMap.put("Ford", "Focus");
        treeMap.put("Renault", "Megan");
        treeMap.put("Dacia", "Logan");
        printFirstAndLastEntry(treeMap);

    }
    public static void printFirstAndLastEntry (TreeMap <String,String> input){
        System.out.println("First entry : " +input.firstEntry());
        System.out.println("Last entry : "+input.lastEntry());

    }
}
