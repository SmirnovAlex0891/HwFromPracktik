/**
 * Дан массив чисел в котором все числа имеют повторения, кроме одного числа. Найти это число
 */
package HW_16_02_2023;

import java.util.HashMap;
import java.util.Map;

public class Hw1_WithHashMap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 5, 8, 9, 2, 4, 6, 1, 6, 7, 8, 9, 9, 3, 7, 3, 2};
        System.out.println("Not a pair element: " + findNum(arr));
    }

    public static int findNum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
