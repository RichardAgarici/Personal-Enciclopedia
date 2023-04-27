package sda.streams.exemple1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ex 2 Create a method that takes a string list as a parameter, then returns that list sorted alphabetically from Z to A case-insensitive.
 */

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Bogdan");
        stringList.add("Car");
        stringList.add("Bike");
        stringList.add("Truck");
        stringList.add("CHAT");
        stringList.add("chat");

        System.out.println(orderCaseList(stringList));

    }
    public static List<String> orderCaseList(List<String> inputList){

        return inputList.stream()
                .sorted((o1,o2) ->o2.compareToIgnoreCase(o1))
                .collect(Collectors.toList());
    }
}