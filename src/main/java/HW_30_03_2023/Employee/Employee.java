package HW_30_03_2023.Employee;

import java.util.ArrayList;
import java.util.List;

public class Employee<T extends CTO> {
    private EmpComparator<T> empComparator = new EmpComparator<>();
    private List<T> list = new ArrayList<>();

    public void add(T emp) {
        if (!list.contains(emp)) {
            list.add(emp);
        }
        list.sort(empComparator);
    }
    public void delete(T emp) {
        list.remove(emp);
    }
    public int search(T emp) {
        if (list.contains(emp)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(emp)) return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
