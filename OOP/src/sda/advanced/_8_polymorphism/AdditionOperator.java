package sda.advanced._8_polymorphism;

public class AdditionOperator extends BinaryOperator{
  
  public AdditionOperator(int operand1, int operand2) {
    super(operand1, operand2);
  }

  @Override
  public int operate() {
    return this.operand1 + this.operand2;
  }
  
  public int getGreaterOperator(){
    return Math.max(operand1, operand2);
  }
}
