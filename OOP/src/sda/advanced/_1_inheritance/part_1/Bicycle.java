package sda.advanced._1_inheritance.part_1;


// private
// package-private (default)
// protected
// public

public class Bicycle {
  // fields / attributes / instance variables 
  public int gear;
  public int speed;
  
  public Bicycle(int gear, int speed) {
    this.gear = gear;
    this.speed = speed;
  }
 
  
  
  public void applyBreak(int decrement){
    speed -= decrement;
  }

  public void speedUp(int increment){
    speed += increment;
  }
}




