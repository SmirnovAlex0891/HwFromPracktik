package hw_2023_03_16;

import java.util.Set;
import java.util.TreeSet;

public class testPerson {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();

        Person person1 = new Person("Bob", "IT", 33, 2000, new Cat(122, "Murzic", 2, 17.5, "White"));
        Person person2 = new Person("Bob", "IT", 33, 2000, new Cat(122, "Murzic", 2, 17.5, "Black"));
        Person person3 = new Person("Bob", "IT", 33, 2000, new Cat(122, "Murzic", 2, 17.5, "Red"));
        Person person4 = new Person("Bob", "IT", 33, 2000, new Cat(122, "Murzic", 2, 17.5, "Blue"));
        Person person5 = new Person("Bob", "IT", 33, 2000, new Cat(122, "Murzic", 2, 17.5, "Green"));

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        System.out.println(people);
    }
}
