package sda.advanced._8_polymorphism;

public class SubtractOperator extends BinaryOperator {

  public SubtractOperator(int operand1, int operand2) {
    super(operand1, operand2);
  }

  @Override
  public int operate() {
    return operand1 - operand2;
  }
}
