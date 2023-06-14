package hw_2023_03_30.Employee;

public class Main {
    public static void main(String[] args) {
        CTO cto1 = new CTO("Pol", 38);
        TeamLead teamLead1 = new TeamLead("Jack", 35);
        Senior senior1 = new Senior("Bob", 34);
        Middle middle1 = new Middle("Adam", 32);
        Manager manager1 = new Manager("Anna", 28);
        Junior junior1 = new Junior("Nik", 30);

        Employee<CTO> employee = new Employee();
        employee.add(cto1);
        employee.add(middle1);
        employee.add(senior1);
        employee.add(teamLead1);
        employee.add(manager1);
        employee.add(junior1);
        employee.add(teamLead1);
        employee.add(senior1);

        System.out.println(employee);
    }
}
