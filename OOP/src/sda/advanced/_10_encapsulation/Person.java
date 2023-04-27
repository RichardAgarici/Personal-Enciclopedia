package sda.advanced._10_encapsulation;

public class Person {
  
  private String firstName;
  private String lastName;
  private int age;
  private String cnp;

  public Person(String firstName, String lastName, int age, String cnp) {
    this.firstName = firstName;
    this.lastName = lastName;
    if(age >= 0 && age < 120){
      this.age = age;
    } else{
      System.err.println("The value provided for age is incorrect!");
    }
    this.cnp = cnp;
  }

  public String getName(){
    return firstName;
  }

  public void setAge(int age) {
    if(age >= 0 && age < 120){
      this.age = age;
    } else{
      System.err.println("The value provided for age is incorrect!");
    }
  }
}

class Main{

  public static void main(String[] args) {
    
    Person person = new Person("Leo", "Messi", 35, "123456789");

    System.out.println(person.getName());
    
    person.setAge(-10);
    
  }
}
