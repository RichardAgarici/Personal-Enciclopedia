package sda.advanced._2_abstract_classes;

public abstract class Animal {
  
  abstract void makeSound();
  
  public void eat(){
    System.out.println("I can eat!");
  }
}

class Dog extends Animal{
  
  // this class needs to implement this method because it is abstract in the base class
  public void makeSound(){
    System.out.println("Bark bark!");
  }
}

class Cat extends Animal{

  public void makeSound(){
    System.out.println("Meow!");
  }
}

class Main{

  public static void main(String[] args) {
    
    Dog d1 = new Dog();
    
    d1.makeSound();
    d1.eat();
    
    Animal cat = new Cat();
    cat.makeSound();
    cat.eat();
    
  }
  
}


