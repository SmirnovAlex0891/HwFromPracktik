package HW_21_03_2023;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Comparable<Employee>{
    private String fullName;
    private int age;
    private int salary;
    private Department department;
    private Rate rate;

    @Override
    public int compareTo(Employee emp) {
        if(this.fullName.compareTo(emp.fullName) == 0) {
            if (this.age - emp.age == 0) {
                if (this.salary - emp.salary == 0) {
                    return this.department.compareTo(emp.department);
                } else {
                    return this.salary - emp.salary;
                }
            } else {
                return this.age - emp.age;
            }
        } else {
            return this.fullName.compareTo(emp.fullName);
        }
    }
}
