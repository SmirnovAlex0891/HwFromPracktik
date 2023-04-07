package HW_30_03_2023.Employee;

import java.util.Comparator;

public class EmpComparator<T extends CTO> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o2.getAge() - o1.getAge();
    }
}
