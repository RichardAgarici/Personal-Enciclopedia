package org.example.composite;

public class Manager implements Employee {
    private String name;
    private long employeeId;
    private String position;
    private int age;

    public Manager(long employeeId, String name,String position, int age) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(employeeId + " " + name + " " + age);
    }
}
