package hw_2023_03_16;

import java.util.Objects;

public class Cat implements Comparable<Cat>{
    private int id;
    private String name;
    private int age;
    private double weight;
    private String color;

    public Cat(int id, String name, int age, double weight, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, weight, color);
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.id - cat.id == 0) {
            if (this.name.compareTo(cat.name) == 0) {
                if (this.age - cat.age == 0) {
                    if (this.weight - cat.weight == 0) {
                        return this.color.compareTo(cat.color);
                    } else {
                        return (int) (this.weight - cat.weight);
                    }
                } else {
                    return this.age - cat.age;
                }
            } else {
                return this.name.compareTo(cat.name);
            }
        } else {
            return this.id - cat.id;
        }
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
