package sda.advanced._4_nested_classes;

public class Main {

  public static void main(String[] args) {
    
    Greeters.Romanian romanian = new Greeters.Romanian();
    
    romanian.greet();
    
    
    
    Greeters greeters = new Greeters();
    
    Greeters.Portuguese portuguese = greeters.new Portuguese();
    
    portuguese.greet();
    
  }
}

class Greeters{

  private static String ROMANIAN_GREETING = "Buna ziua!";
  private static String PORTUGUESE_GREETING = "Ola!";
  
  static class Romanian{
    public void greet(){
      System.out.println(ROMANIAN_GREETING);
    }
  }
  
  class Portuguese{
    public void greet(){
      System.out.println(PORTUGUESE_GREETING);
    }
  }
  
}
