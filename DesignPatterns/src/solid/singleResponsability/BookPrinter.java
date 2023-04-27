package org.example.solid.singleResponsability;

public class BookPrinter {
    public void printTextToConsole(String text){
        //formatting
        System.out.println(text);
    }

    public void printTextToOtherEnv(String text) {
        //print text to other environment
    }
}
