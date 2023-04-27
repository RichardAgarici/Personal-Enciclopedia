package sda.advanced._17_generics;

public class FirstExample {

  public static void main(String[] args) {
    
    Box<Gift> giftBox = new Box<>();
    
    // gift was packed for delivery
    giftBox.putInside(new Gift("Kylie Jenner makeup", 600));

    // gift was unpacked by the receiver
    Gift gift = giftBox.getOut();
    
    System.out.println(gift);
    
    
    Box<Furniture> furnitureBox = new Box<>();
    
    furnitureBox.putInside(new Furniture("Ikea", 2000, "wardrobe"));

    System.out.println(furnitureBox.getOut());
    
  }
}

class Box<A> {
  private A objectInside;
  
  public void putInside(A objectInside){
    this.objectInside = objectInside;
  }
  
  public A getOut(){
    return this.objectInside;
  }
}

class Gift{
  private String name;
  private double price;

  public Gift(String name, double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Gift{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}


class Furniture{
  
  private String brand;
  private double price;
  private String name;

  public Furniture(String brand, double price, String name) {
    this.brand = brand;
    this.price = price;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Furniture{" +
        "brand='" + brand + '\'' +
        ", price=" + price +
        ", name='" + name + '\'' +
        '}';
  }
}