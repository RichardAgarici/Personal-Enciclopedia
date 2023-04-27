package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirector implements Employee{
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmploy(Employee e){
        employeeList.add(e);
    }

    public void removeEmployee(Employee e){
        employeeList.remove(e);
    }

    @Override
    public void showEmployeeDetails() {
        for(Employee e : employeeList) {
            e.showEmployeeDetails();
        }
    }
}
