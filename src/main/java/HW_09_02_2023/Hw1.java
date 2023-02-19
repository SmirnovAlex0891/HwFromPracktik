//Дан массив и число n
//Вывести на экран два любых числа из массива которые
//в сумме дают n за O(n) либо написать что таких
//чисел нет
//[0 1 5 4 8 9 3 2 6] n = 13
package HW_09_02_2023;

public class Hw1 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 3, 4, 8, 9, 12, 2, 6};
        int n = 13;
        getTwoNumbers(arr, n);
    }

    public static void getTwoNumbers(int[] arr, int n) {
        int a = -1;
        int b = -1;
        int i = 0;
        int x;

        while (i < arr.length) {
            if (n - arr[i] > 0) {
                if (a == -1) a = arr[i];
                x = i;
                i++;
                while (i < arr.length) {
                    if (a + arr[i] == n && b == -1) {
                        b = arr[i];
                        break;
                    }
                    i++;
                }
                if (b == -1) {
                    i = x;
                    a = -1;
                } else {
                    break;
                }
            }
            i++;
        }

        if (a == -1 || b == -1) {
            System.out.println("Numbers missing");
        } else {
            System.out.println("First number is: " + a);
            System.out.println("Second number is: " + b);
        }
    }
}
