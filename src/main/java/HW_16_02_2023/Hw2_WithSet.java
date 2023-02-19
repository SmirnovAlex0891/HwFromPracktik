/**
 * Дан массив чисел, в котором есть все числа от 0 до N . Все эти числа в
 * единственном экземпляре. Расположены в разнобой. Одно число в этом массиве
 * пропущено ( Например {1 0 2 8 6 5 4 7} - это 3 ) . Найти пропущенное число
 */
package HW_16_02_2023;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hw2_WithSet {
    public static void main(String[] args) {
        int[] arr = {6, 0, 2, 4, 3, 5, 8, 7};
        System.out.println("Missing element: " + findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int tmp = it.next();
            if (tmp - 1 == res) {
                res = tmp;
            } else {
                return res + 1;
            }
        }
        return -1;
    }
}
