package sda.advanced._14_exceptions;

public class SecondExample {

  public static void main(String[] args) {
    
    System.out.println("Result is: " + add(10, 50));

    
    
    try {
      doAddOperation();
    } catch (MyUncheckedException exception){
      System.out.println(exception.getMessage());
    }

    
    try {
      doDivideOperation();
    } catch (CheckedException e) {
      System.out.println(e.getMessage());
    }


    System.out.println("print something");

  }
  
  static void doDivideOperation() throws CheckedException {
    divide(-10, 100);
  }
  
  static void doAddOperation(){
    System.out.println("Operation in progress");
    add(-30, 25);
  }
  
  
  static int add(int a, int b){
    if(a > 0 && b > 0){
      return a + b;
    } else {
      throw new MyUncheckedException("Both operands must be greater then 0");
    }
  }
  
  // because we throw a checked exception we need to signal to this method callers that this method could throw this exception
  static int divide(int a, int b) throws CheckedException {
    if(a > 0 && b > 0){
      return a / b;
    } else {
      throw new CheckedException("Both operands must be greater then 0");
    }
  }
}

// exceptions that inherit from runtimeException are unchecked exceptions
class MyUncheckedException extends RuntimeException {
  public MyUncheckedException(String message) {
    super(message);
  }
}

// exceptions that inherit from exception are checked exceptions
class CheckedException extends Exception {
  public CheckedException(String message) {
    super(message);
  }
}