package sda.advanced._6_anonymous_classes;

import java.util.Scanner;

public abstract class MyAbstractClass {
  
  public abstract void doIt();
}


//class AbstractImplementation extends MyAbstractClass{
//
//  @Override
//  public void doIt() {
//    System.out.println("Implemented method");
//  }
//}

class Main{

  public static void main(String[] args) {
    
    // we created a new class here without a name, an anonymous class
    MyAbstractClass myAbstractClass = new MyAbstractClass() {
      @Override
      public void doIt() {
        System.out.println("Implemented method");  
      }
    };


    Scanner scanner = new Scanner(System.in);
    
    myAbstractClass.doIt();
    
  }
  
}
