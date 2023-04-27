package sda.advanced._13_hashmap.part_2;

import java.util.Objects;

public class Person {
  private String firstName;
  private String lastName;
  private String cnp;
  private int age;

  public Person(String firstName, String lastName, String cnp, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.cnp = cnp;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCnp() {
    return cnp;
  }

  public void setCnp(String cnp) {
    this.cnp = cnp;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", cnp='" + cnp + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(cnp, person.cnp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, cnp, age);
  }
}
