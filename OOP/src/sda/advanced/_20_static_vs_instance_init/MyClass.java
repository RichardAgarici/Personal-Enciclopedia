package sda.advanced._20_static_vs_instance_init;

public class MyClass {
  
  String name;

  public MyClass(String name) {
    this.name = name;
  }

  static {
    System.out.println("Hello from static initializer!");
  }
  {
    System.out.println("Hello from instance initializer!");
  }
  
  
  
  
}
