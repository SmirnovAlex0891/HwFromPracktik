/**
 * Дан массив чисел, в котором есть все числа от 0 до N . Все эти числа в
 * единственном экземпляре. Расположены в разнобой. Одно число в этом массиве
 * пропущено ( Например {1 0 2 8 6 5 4 7} - это 3 ) . Найти пропущенное число
 */
package HW_16_02_2023;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HwTwoWithSet {
    public static void main(String[] args) {
        int[] arr = {-50, -45, -44, -49, -47, -46};
        System.out.println("Missing element: " + findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        int prev = Integer.MIN_VALUE;
        for (int j : arr) {
            set.add(j);
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int tmp = it.next();
            if (prev == Integer.MIN_VALUE) {
                prev = tmp;
            } else if (tmp - 1 == prev) {
                prev = tmp;
            } else {
                return prev + 1;
            }
        }
        return -1;
    }
}
