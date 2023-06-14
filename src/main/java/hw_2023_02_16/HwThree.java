/**
 * Дан массив чисел. Найти число состоящее из собственных делителей.
 * Например число 128 состоит из 1 2 и 8. 128 % 1 == 0 , 128 % 2 == 0 и 128 % 8 == 0.
 * Вот такие числа надо найти.
 **/
package hw_2023_02_16;

import java.util.ArrayList;
import java.util.List;

public class HwThree {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i;
        }
        System.out.println("Number of divisors: " + "\n" + findNumber(arr));
    }

    public static List<Integer> findNumber(int[] arr) {
        int tmp;
        String s;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            s = String.valueOf(arr[i]);
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {
                tmp = Integer.parseInt(s.substring(j, (j + 1)));
                if (tmp != 0) {
                    if (arr[i] % tmp != 0) {
                        flag = false;
                    }
                } else {
                    flag = false;
                }
            }
            if (flag) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
