package sda.advanced._15_enums.part_2;

public enum Coffee {

  LATTE(10, "Coffee with milk"),
  ESPRESSO(6, "Short coffee"),
  AMERICANO(8, "Long coffee");

  private int price;
  private String description;

  // private by default
  private Coffee(int price, String description) {
    this.price = price;
    this.description = description;
  }

  public int getPrice() {
    return price;
  }

  public String getDescription() {
    return description;
  }
}
