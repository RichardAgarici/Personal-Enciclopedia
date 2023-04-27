package sda.advanced._5_local_classes;

public class Main {

  public static void main(String[] args) {
   
    createPair("myKey", "myValue");
  }
  
  public static void createPair(String k, String v){
    class Pair{
      public String key;
      public String value;

      public Pair(String key, String value) {
        this.key = key;
        this.value = value;
      }
    }
    Pair myPair = new Pair(k, v);
  }
  
}
