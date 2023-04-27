package sda.advanced._13_hashmap.part_1;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    
    Map<String, Integer> vehicleMaxSpeedMap = new HashMap<>();
    
    vehicleMaxSpeedMap.put("Bike", 50);
    vehicleMaxSpeedMap.put("Car", 200);
    vehicleMaxSpeedMap.put("Truck", 90);
    vehicleMaxSpeedMap.put("Boat", 70);

    System.out.println(vehicleMaxSpeedMap);
    
    
    int value = vehicleMaxSpeedMap.get("Truck");
    System.out.println("Value for Truck is: " + value);
    
    vehicleMaxSpeedMap.remove("Boat");

    System.out.println(vehicleMaxSpeedMap);
  }
}
