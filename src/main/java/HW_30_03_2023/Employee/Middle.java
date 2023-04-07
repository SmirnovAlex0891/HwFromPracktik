package HW_30_03_2023.Employee;

public class Middle extends TeamLead{
    private String name;
    private int age;

    public Middle(String name, int age) {
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
        return "Middle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
