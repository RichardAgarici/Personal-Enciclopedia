package sda.advanced._8_polymorphism;

public class Main {

  public static void main(String[] args) {

    BinaryOperator binaryOperator = new BinaryOperator(6, 5);
    
    BinaryOperator operatorAdd = new AdditionOperator(6, 5);

    BinaryOperator operatorSub = new SubtractOperator(6, 5);

    
    System.out.println("Binary = " + binaryOperator.operate());

    System.out.println("Addition = " + operatorAdd.operate());

    System.out.println("Subtraction = " + operatorSub.operate());



    AdditionOperator opr = new AdditionOperator(1, 2);

    System.out.println("Greater is: " + opr.getGreaterOperator());


  }
}
