package sda.advanced._1_inheritance.part_2;

public class Animal {
  public void displayInfo() {
    System.out.println("I am an animal!");
  }
  
}

class Dog extends Animal {

  @Override
  public void displayInfo() {
    System.out.println("I am a dog");
  }
}

class Main{
  public static void main(String[] args) {
    
    Dog myDog = new Dog();
    myDog.displayInfo();
  }
}