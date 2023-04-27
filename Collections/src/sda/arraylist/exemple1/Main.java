package sda.arraylist.exemple1;

/**
 * Extend the ArrayList class by implementing the getEveryNthElement() method.
 * This method returns a list of elements and takes two parameters: the element index from which it starts and a number specifying which element to choose.
 * For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g]
 */
public class Main {

    public static void main(String[] args) {

        SdaArrayList<String> listOfInteger = new SdaArrayList<>();

        listOfInteger.add("a");
        listOfInteger.add("b");
        listOfInteger.add("c");
        listOfInteger.add("d");
        listOfInteger.add("e");
        listOfInteger.add("f");
        listOfInteger.add("g");

        System.out.println(listOfInteger.getEveryNthElement(2,3));
        System.out.println(listOfInteger.getEveryNthElement(2,3));
        System.out.println(listOfInteger.getEveryNthElement(56,-1));



    }

}
