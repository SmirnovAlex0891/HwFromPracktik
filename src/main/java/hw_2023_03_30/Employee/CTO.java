package hw_2023_03_30.Employee;

public class CTO {
    private String name;
    private int age;

    public CTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "CTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
