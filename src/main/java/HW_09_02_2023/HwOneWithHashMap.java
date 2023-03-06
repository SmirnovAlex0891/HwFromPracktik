//Дан массив и число n
//Вывести на экран два любых числа из массива которые
//в сумме дают n за O(n) либо написать что таких
//чисел нет
//[0 1 5 4 8 9 3 2 6] n = 13
package HW_09_02_2023;

import java.util.HashMap;
import java.util.Map;

public class HwOneWithHashMap {
    public static void main(String[] args) {
        int arr[] = {0, 1, 3, 4, 8, 9, 12, 2, 6};
        int n = 13;
        getTwoNumbers(arr, n);
    }

    public static void getTwoNumbers(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(n - arr[i])) {
                System.out.printf("Pair found (%d, %d)",
                        arr[map.get(n - arr[i])], arr[i]);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("Numbers missing");
    }
}
