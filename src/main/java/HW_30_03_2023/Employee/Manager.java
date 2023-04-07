package HW_30_03_2023.Employee;

public class Manager extends TeamLead{
    private String name;
    private int age;

    public Manager(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
