package HW_27_04_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Разбить список на подсписки заданного размера
 * Дан список элементов и размер подсписков. Необходимо разбить список
 * на подсписки указанного размера. Решение можно осуществить
 * с помощью Stream API
 * List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
 * int size = 3;
 */
public class Task7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int size = 3;


        List<List<Integer>> newList = list.stream()
                .collect(ArrayList::new,
                        (l, el) -> {
                            if (l.isEmpty() || l.get(l.size() - 1).size() == size) {
                                l.add(new ArrayList<Integer>(Collections.singletonList(el)));
                            } else if (l.get(l.size() - 1).size() < size) {
                                l.get(l.size() - 1).add(el);
                            }

                        }, ArrayList::addAll);
        System.out.println(newList);


    }
}
