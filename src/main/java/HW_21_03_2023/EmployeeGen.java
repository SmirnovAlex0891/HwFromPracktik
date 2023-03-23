package HW_21_03_2023;

import com.github.javafaker.Faker;

import java.util.Random;

public class EmployeeGen {
    public Employee EmployeeGen() {
        Faker faker = new Faker();
        Employee employee = new Employee(faker.name().fullName(),
                new Random().nextInt(20, 50),
                new Random().nextInt(500, 3000),
                Department.values()[new Random().nextInt(1, 5)],
                Rate.values()[new Random().nextInt(1, 5)]);
        return employee;
    }
}
