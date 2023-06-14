package hw_2023_03_16.WithComparator;

public class PersonWithComparator {
    private String name;
    private String department;
    private int age;
    private int salary;
    private CatWhitComparator cat;

    public PersonWithComparator(String name, String department, int age, int salary, CatWhitComparator cat) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public CatWhitComparator getCat() {
        return cat;
    }

    @Override
    public String toString() {
        return "\n" + "Person{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", cat=" + cat +
                '}';
    }
}
