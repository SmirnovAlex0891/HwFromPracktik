package hw_2023_03_21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1. class Company имя и лист департаментов
 * 2. Энам Департаменты с 5 макисмум департаментами
 * 3. Класс Эплои с полями имя позраст зарплата и рейтинг
 * 4. Энам рейтинг  если рейтинг:
 * A то +20%
 * B +15%
 * C +5%
 * D 0%
 * E -5%
 * 5. Класс генератор который создает Эмплои и засовывет его в рандомный департамент с рандомным рейтингом и зарплатой
 * Эмплои должен иметьспособность сравниматься по всем полям кроме ретинга
 * 6. Сделать отдельный компаратор который сортирует по рейтингу
 * 7. В классе Мэйн надо прописать только один метод с параметрок количеством сотрудников который с генерирует весь
 * этот процесс и выведет на экран Сотрудника с зп ДО и После
 * <p>
 * Повышать за надо пройдясь по лситу сотрудников итератором
 */
public class Main {
    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        List<Department> dep = new ArrayList<>();
        Company company = new Company("Roga i kopyta", dep);

        createCom(15);

    }

    public static void createCom(int n) {
        EmployeeGen gen = new EmployeeGen();
        for (int i = 0; i < n; i++) {
            employees.add(gen.EmployeeGen());
        }
        editSalaryEmp();
    }

    public static void editSalaryEmp() {
        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();
            System.out.println("Before edit salary: " + emp);

            switch (emp.getRate()) {
                case A -> emp.setSalary((int) (emp.getSalary() * 1.2));
                case B -> emp.setSalary((int) (emp.getSalary() * 1.15));
                case C -> emp.setSalary((int) (emp.getSalary() * 1.05));
                case E -> emp.setSalary((int) (emp.getSalary() * 0.95));
            }
            System.out.println("After edit salary: " + emp);
            System.out.println("*********************************");
        }
    }
}
