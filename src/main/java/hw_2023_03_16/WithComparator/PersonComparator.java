package hw_2023_03_16.WithComparator;

import java.util.Comparator;

public class PersonComparator implements Comparator<PersonWithComparator> {
    @Override
    public int compare(PersonWithComparator person1, PersonWithComparator person2) {
        if (person1.getName().compareTo(person2.getName()) == 0) {
            if (person1.getDepartment().compareTo(person2.getDepartment()) == 0) {
                if (person1.getAge() - person2.getAge() == 0) {
                    return person1.getSalary() - person2.getSalary();
                } else {
                    return person1.getAge() - person2.getAge();
                }
            } else {
                return person1.getDepartment().compareTo(person2.getDepartment());
            }
        } else {
            return person1.getName().compareTo(person2.getDepartment());
        }
    }
}
