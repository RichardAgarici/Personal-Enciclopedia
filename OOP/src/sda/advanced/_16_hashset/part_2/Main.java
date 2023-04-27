package sda.advanced._16_hashset.part_2;

import java.util.HashSet;

public class Main {


  public static void main(String[] args) {


    TravelDestination dest1 = new TravelDestination("Kiev", 2_800_000, "The capital of a brave men state. They keep fighting for freedom.");
    TravelDestination dest2 = new TravelDestination("Kiev", 100_000, "Un oras din Romania");


    System.out.println(dest1.equals(dest2));


    HashSet<TravelDestination> agencyDestinations = new HashSet<>();

    agencyDestinations.add(new TravelDestination("Amsterdam", 1_000_000, "Beautiful city with a lot of museums and tourist attractions."));
    agencyDestinations.add(new TravelDestination("Barcelona", 1_600_000, "The capital of Catalonia. Home city of FC Barcelona."));
    agencyDestinations.add(new TravelDestination("Los Angeles", 3_800_000, "A beautiful city known for its Hollywood film industry"));
    agencyDestinations.add(new TravelDestination("Kiev", 2_800_000, "The capital of a brave men state. They keep fighting for freedom."));
    agencyDestinations.add(new TravelDestination("Barcelona", 1_600_000, "The capital of Catalonia. Home city of FC Barcelona."));


    for(TravelDestination element : agencyDestinations){
      System.out.println(element);
    }

    TravelDestination kievDestination = new TravelDestination("Kiev", 2_800_000, "The capital of a brave men state. They keep fighting for freedom.");

    agencyDestinations.add(kievDestination);

    System.out.println("---------------------------------");


    for(TravelDestination element : agencyDestinations){
      System.out.println(element);
    }
    
    System.out.println(agencyDestinations.contains(kievDestination));
    
    // nume prenume -> send -> https -> server (applicatie in java/php/c# - backend) -> baza de date -> error -> java exception -> catch -> trimitem un mesaj de eroare inapoi -> https -> mesaul ajunge la tine
    
  }
}
