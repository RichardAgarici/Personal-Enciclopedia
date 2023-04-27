package composite;

public class Developer implements Employee {
    private String name;
    private long employeeId;
    private String position;

    public Developer(long employeeId, String name, String position) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(employeeId + " " + name);
    }
}
