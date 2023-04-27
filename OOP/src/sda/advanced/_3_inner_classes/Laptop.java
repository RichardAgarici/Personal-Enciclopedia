package sda.advanced._3_inner_classes;

// outer class
public class Laptop {
  public double price;

  public Laptop(double price) {
    this.price = price;
  }

  // inner class 
  class Processor {

    int numberOfCores;
    String manufacturer;

    public Processor(int numberOfCores, String manufacturer) {
      this.numberOfCores = numberOfCores;
      this.manufacturer = manufacturer;
    }

    double getLaptopPrice(){
      return price;
    }

    double getCacheSize() {
      return 4.3;
    }
  }
}

class Main{

  public static void main(String[] args) {
    
    Laptop myLaptop = new Laptop(100.23);

    Laptop.Processor processor = myLaptop.new Processor(4, "amd");

    System.out.println(processor.getLaptopPrice());

    System.out.println(processor.getCacheSize());
    
  }
  
}
