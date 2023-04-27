package sda.advanced._7_interfaces.part_2;

public class ReadFromLocal implements ReadFile{
  
  @Override
  public void read() {
    System.out.println("File was read from disk/pc");  
  }
}
