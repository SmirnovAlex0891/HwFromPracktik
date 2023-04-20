package HW_20_04_2023;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 1. Создать класс департамент
 * 2. В классе Деп поля List<Employee>, имя департамента и количество сотрудников
 * 3. Сделать класс Сотрудники
 * 4. Поля в сотрудниках имя, фамилия пол возраст и зарплата
 * 5. Сделать три департамена и поместить в кажды по листу сотрудников в каждом листе минимум по 5 сотрудников
 * 6. Стримами пройтись по ЛИСТУ ДЕПАРТАМЕНТОВ
 * и вывести на эеран всех сотрудников(имена и фамилии) зп которых больше 2500
 */
public class Main {
    public static void main(String[] args) {
        Faker f = new Faker();
        Random r = new Random();
        Department d1 = new Department(new ArrayList<>(), "IT");
        Department d2 = new Department(new ArrayList<>(), "Marketing");
        Department d3 = new Department(new ArrayList<>(), "Law");
        List<Department> departments = new ArrayList<>(Arrays.asList(d1, d2, d3));
        List<Employee> tmp = new ArrayList<>();

        for (Department d : departments) {
            for (int i = 0; i < 5; i++) {
                tmp.add(new Employee(f.name().firstName(), f.name().lastName(), "M", r.nextInt(20, 50), r.nextInt(1500, 3000)));
            }
            d.setEmployees(tmp);
        }

        for (Department d : departments) {
            for (Employee e : d.getEmployees()) {
                System.out.println(e);
            }
        }
        System.out.println("*************************************");
        departments.stream()
                .map(Department::getEmployees)
                .flatMap(l -> l.stream()
                        .filter(emp -> emp.getSalary() > 2500))
                .forEach(System.out::println);

    }
}
