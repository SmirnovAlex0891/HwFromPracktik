package HW_16_03_2023.WithComparator;

public class CatWhitComparator {
    private int id;
    private String name;
    private int age;
    private double weight;
    private String color;

    public CatWhitComparator(int id, String name, int age, double weight, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
