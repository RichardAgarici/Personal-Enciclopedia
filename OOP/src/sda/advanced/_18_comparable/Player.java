package sda.advanced._18_comparable;

public class Player implements Comparable<Player> {
  private int raking;
  private String name;
  private int age;

  public Player(int raking, String name, int age) {
    this.raking = raking;
    this.name = name;
    this.age = age;
  }

  public int getRaking() {
    return raking;
  }

  public void setRaking(int raking) {
    this.raking = raking;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Player{" +
        "raking=" + raking +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public int compareTo(Player otherPlayer) {
    
    if(this.raking > otherPlayer.getRaking()){
      return -1;
    } else if( this.raking == otherPlayer.getRaking()){
      return 0;
    } else{
      return 1;
    }
    
  }
}
