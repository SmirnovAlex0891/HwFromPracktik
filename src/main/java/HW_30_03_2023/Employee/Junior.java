package HW_30_03_2023.Employee;

public class Junior extends TeamLead {
    private String name;
    private int age;

    public Junior(String name, int age) {
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
        return "Junior{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
