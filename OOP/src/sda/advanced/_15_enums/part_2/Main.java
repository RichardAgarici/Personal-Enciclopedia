package sda.advanced._15_enums.part_2;

public class Main {

  public static void main(String[] args) {
    
    Coffee latte = Coffee.LATTE;

    System.out.println("Order of late in enum constants is: " + latte.ordinal());

    System.out.println("The following coffee " + latte + " has price: " + latte.getPrice() 
        + " and description: " + latte.getDescription());


    System.out.println("The following coffee " + Coffee.ESPRESSO + " has price: " + Coffee.ESPRESSO.getPrice()
        + " and description: " + Coffee.ESPRESSO.getDescription());


  }
}
