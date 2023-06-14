package hw_2023_03_21;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getRate().compareTo(emp2.getRate());
    }
}
