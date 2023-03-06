// заполнить массив числами фибоначчи
package HW_07_02_2023;

import java.util.Arrays;

public class HwFour {
    public static void main(String[] args) {
        int n = 15;
        fib(n);
    }
    private static void fib(int n) {
        int[] arr = new int[n];
        int sum = 0;
        int sum1 = 1;
        arr[0] = sum;
        arr[1] = sum1;
        for (int i = 2; i < n; i++) {
            arr[i] = sum + sum1;
            sum = sum1;
            sum1 = arr[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
