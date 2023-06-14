package hw_2023_03_16.WithComparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class testPerson {
    public static void main(String[] args) {
        Comparator<PersonWithComparator> comparator = new PersonComparator().thenComparing(new CatComparator());
        Set<PersonWithComparator> people = new TreeSet<>(comparator);

        PersonWithComparator person1 = new PersonWithComparator("Bob", "IT", 33, 2000, new CatWhitComparator(122, "Murzic", 2, 17.5, "White"));
        PersonWithComparator person2 = new PersonWithComparator("Bob", "IT", 33, 2000, new CatWhitComparator(122, "Murzic", 2, 17.5, "Black"));
        PersonWithComparator person3 = new PersonWithComparator("Bob", "IT", 33, 2000, new CatWhitComparator(122, "Murzic", 2, 17.5, "Red"));
        PersonWithComparator person4 = new PersonWithComparator("Bob", "IT", 33, 2000, new CatWhitComparator(122, "Murzic", 2, 17.5, "Blue"));
        PersonWithComparator person5 = new PersonWithComparator("Bob", "IT", 33, 2000, new CatWhitComparator(122, "Murzic", 2, 17.5, "Green"));

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        System.out.println(people);
    }
}
