package sda.advanced._15_enums.part_1;

public class Main {

  public static void main(String[] args) {

    Coffee myCoffee = Coffee.LATTE;

    Coffee otherCoffee = Coffee.ESPRESSO;

    System.out.println(myCoffee);

    System.out.println(otherCoffee);


    Coffee enumFromString = Coffee.valueOf("AMERICANO");

    System.out.println(enumFromString);


    System.out.println("LATTE order in enum constants is: " + myCoffee.ordinal());

    System.out.println("AMERICANO order in enum constants is: " + Coffee.AMERICANO.ordinal());


  }
}
