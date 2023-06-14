package hw_2023_03_30.Employee;

public class TeamLead extends CTO{
    private String name;
    private int age;

    public TeamLead(String name, int age) {
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
        return "TeamLead{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
