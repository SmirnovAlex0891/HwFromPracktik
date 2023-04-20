package HW_20_04_2023;

import java.util.List;

public class Department {
    private List<Employee> employees;
    private String name;

    public Department(List<Employee> employees, String name) {
        this.employees = employees;
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
