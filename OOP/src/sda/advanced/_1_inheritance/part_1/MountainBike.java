package sda.advanced._1_inheritance.part_1;

public class MountainBike extends Bicycle {

  public int seatHeight;
  
  public MountainBike(int gear, int speed, int seatHeight) {
    super(gear, speed);
    this.seatHeight = seatHeight;
  }
  
  public void adjustSeatUp(){
    if(seatHeight < 5){
      seatHeight++;
    }else{
      System.out.println("Seat is already at maximum level!");
    }
  }
  
  public void adjustSeatDown(){
    if(seatHeight > 0){
      seatHeight--;
    }else{
      System.out.println("Seat height is already at minimum level!");
    }
    
  }


}
