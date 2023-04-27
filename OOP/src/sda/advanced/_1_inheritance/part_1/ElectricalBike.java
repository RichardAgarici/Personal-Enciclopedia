package sda.advanced._1_inheritance.part_1;

public class ElectricalBike extends Bicycle {

  public int batteryLevel;

  public ElectricalBike(int gear, int speed, int batteryLevel) {
    super(gear, speed);
    this.batteryLevel = batteryLevel;
  }

  void recharge() {
    this.batteryLevel = 100;
  }
}
