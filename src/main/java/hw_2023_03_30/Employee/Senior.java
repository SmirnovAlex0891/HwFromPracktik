package hw_2023_03_30.Employee;

public class Senior extends TeamLead{
    private String name;
    private int age;

    public Senior(String name, int age) {
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
        return "Senior{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
