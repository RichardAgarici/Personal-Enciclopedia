package sda.advanced._7_interfaces.part_2;

public class ReadOverNetwork implements ReadFile{
  
  @Override
  public void read() {
    System.out.println("Connecting to remote server");
    System.out.println("The file was read from a remote server.");
  }
}
