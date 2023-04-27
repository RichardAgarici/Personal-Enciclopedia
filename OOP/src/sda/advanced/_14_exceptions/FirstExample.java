package sda.advanced._14_exceptions;

import java.util.ArrayList;
import java.util.List;

public class FirstExample {

  public static void main(String[] args) {
    
    int a = 600;
    int b = 0;

    List<String> list = new ArrayList<>();
    list.add("something");

    try {
      
      list.get(2);
      
      int c = a / b;
      System.out.println("Result is: " + c);
      
      
    } catch (ArithmeticException ex){
      
      System.out.println("We failed to divide.");
      System.err.println(ex.getMessage());
      
    } finally {

      System.out.println("The block that is executed no matter what!");
    }

    System.out.println("Hello from outside of try block");

  }
  
  
}
