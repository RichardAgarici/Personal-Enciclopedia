package sda.advanced._18_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Player> csgoPlayers = new ArrayList<>();

    csgoPlayers.add(new Player(59, "John", 20));
    csgoPlayers.add(new Player(20, "Roger", 60));
    csgoPlayers.add(new Player(1, "Max", 24));
    csgoPlayers.add(new Player(67, "Steven", 17));

    System.out.println("Before sorting:");
    
    for (Player player : csgoPlayers){
      System.out.println(player);
    }

    Collections.sort(csgoPlayers);


    System.out.println("After sorting:");
    
    for (Player player : csgoPlayers){
      System.out.println(player);
    }
    
  }
}
