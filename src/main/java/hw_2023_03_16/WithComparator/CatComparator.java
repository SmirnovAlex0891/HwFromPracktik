package hw_2023_03_16.WithComparator;

import java.util.Comparator;

public class CatComparator implements Comparator<PersonWithComparator> {

    @Override
    public int compare(PersonWithComparator person1, PersonWithComparator person2) {
        if (person1.getCat().getId() - person2.getCat().getId() == 0) {
            if (person1.getCat().getName().compareTo(person2.getCat().getName()) == 0) {
                if (person1.getCat().getAge() - person2.getCat().getAge() == 0) {
                    if (person1.getCat().getWeight() - person2.getCat().getWeight() == 0) {
                        return person1.getCat().getColor().compareTo(person2.getCat().getColor());
                    } else {
                        return (int) (person1.getCat().getWeight() - person2.getCat().getWeight());
                    }
                } else {
                    return person1.getCat().getAge() - person2.getCat().getAge();
                }
            } else {
                return person1.getCat().getName().compareTo(person2.getCat().getName());
            }
        } else {
            return person1.getCat().getId() - person2.getCat().getId();
        }
    }
}
