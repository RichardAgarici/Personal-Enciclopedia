package org.example.composite;

public class Company {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "Name1", "Java Developer");
        Developer dev2 = new Developer(101, "Name2", "Python Developer");
        CompanyDirector director1 = new CompanyDirector();
        director1.addEmploy(dev1);
        director1.addEmploy(dev2);

        Manager man1 = new Manager(200, "Name3", "Dev Manager", 55);
        Manager man2 = new Manager(201, "Name4", "People Manager", 49);
        CompanyDirector director2 = new CompanyDirector();
        director2.addEmploy(man1);
        director2.addEmploy(man2);

        CompanyDirector director3 = new CompanyDirector();
        director3.addEmploy(director1);
        director3.addEmploy(director2);
        director3.showEmployeeDetails();
    }
}
