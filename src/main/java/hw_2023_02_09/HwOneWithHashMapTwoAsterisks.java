//Дан массив и число n
//Вывести на экран два любых числа из массива которые
//в сумме дают n за O(n) либо написать что таких
//чисел нет
//[0 1 5 4 8 9 3 2 6] n = 13

//** все пары чисел
package hw_2023_02_09;

import java.util.HashMap;
import java.util.Map;

public class HwOneWithHashMapTwoAsterisks {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 9, 9, 3, 13, 5, 5};
        int n = 14;
        getTwoNumbers(arr, n);
    }

    public static void getTwoNumbers(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(n - arr[i])) {
                map.put(n - arr[i], arr[i]);
            } else {
                map.put(arr[i], null);
            }
        }
        boolean pars = false;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                System.out.printf("Pair found (%d, %d)", entry.getKey(), entry.getValue());
                System.out.println();
                pars = true;
            }
        }
        if (!pars) System.out.println("Numbers missing");
    }
}
