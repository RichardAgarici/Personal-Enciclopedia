package sda.advanced._11_arraylist;

import ro.sda.advanced._9_composition.Car;

import java.util.ArrayList;

public class Main {


  public static void main(String[] args) {


    int[] myIntArray = new int[10];

    myIntArray[0] = 1000;
    myIntArray[1] = 3000;
    myIntArray[3] = 5000;
    myIntArray[7] = 8000;

    int[] otherIntArray = new int[]{1, 2, 3, 4};



    for(int el : myIntArray){
      System.out.print(el + " ");
    }

    System.out.println();

    for(int el : otherIntArray){
      System.out.print(el + " ");
    }

    System.out.println();

    // ArrayList doesn't have a fixed number of elements

    ArrayList<Car> myCarList = new ArrayList<>();
    ArrayList<String> myStringList = new ArrayList<>();
    ArrayList<Double> myDoubleList = new ArrayList<>();


    int[] testArray = new int[4];

    testArray[0] = 10;
    testArray[1] = 99;
    testArray[2] = 11;
    testArray[3] = 37;

    System.out.println("CLASSIC ARRAY ELEMENTS ARE:");
    for (int el : testArray) {
      System.out.print(el + " ");
    }

    testArray[1] = 0;

    System.out.println("\nSECOND PRINT CLASSIC ARRAY ELEMENTS ARE:");
    for (int el : testArray) {
      System.out.print(el + " ");
    }


    ArrayList<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(99);
    list.add(11);
    list.add(37);

    list.remove(1);

    System.out.println("\nARRAYLIST ELEMENTS ARE:");

    for (int el : list) {
      System.out.print(el + " ");
    }
    
    System.out.println("\n" + list.get(2));


    // idx   0  1  2  3
    // el    10 99 11 37

    // remove index 1

    // idx   0   1    2
    // el    10  11   37


  }

}
