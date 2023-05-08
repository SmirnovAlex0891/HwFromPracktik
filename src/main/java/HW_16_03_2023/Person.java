package HW_16_03_2023;

import java.util.Objects;

class Person implements Comparable<Person>{
    private String name;
    private String department;
    private int age;
    private int salary;
    private Cat cat;

    public Person(String name, String department, int age, int salary, Cat cat) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && salary == person.salary && Objects.equals(name, person.name) && Objects.equals(department, person.department) && Objects.equals(cat, person.cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, age, salary, cat);
    }

    @Override
    public int compareTo(Person person) {
        if (this.name.compareTo(person.name) == 0) {
            if (this.department.compareTo(person.department) == 0) {
                if (this.age - person.age == 0) {
                    if (this.salary - person.salary == 0) {
                        return this.cat.compareTo(person.cat);
                    } else {
                        return this.salary - person.salary;
                    }
                } else {
                    return this.age - person.age;
                }
            } else {
                return this.department.compareTo(person.department);
            }
        } else {
            return this.name.compareTo(person.name);
        }
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
