//Дан массив и число n
//Вывести на экран два любых числа из массива которые
//в сумме дают n за O(n) либо написать что таких
//чисел нет
//[0 1 5 4 8 9 3 2 6] n = 13

//** все пары чисел
package HW_09_02_2023;

public class HwOneTwoDimensionalArrayTwoAsterisks {
    public static void main(String[] args) {
        int arr[] = {0, 1, 4, 4, 9, 9, 3, 13, 5, 5};
        int n = 14;
        getTwoNumbers(arr, n);
    }

    public static void getTwoNumbers(int[] arr, int n) {
        int a = 0;
        int b = 0;
        int i_res = 0;
        int j_res = 0;
        int[][] res = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            if (n - arr[i] > 0) {
                while (i_res < arr.length) {
                    if (res[i_res][j_res] == 0) {
                        res[i_res][j_res] = arr[i];
                        break;
                    } else if (res[i_res][j_res + 1] == 0 && res[i_res][j_res] + arr[i] == n) {
                        res[i_res][j_res + 1] = arr[i];
                        i_res++;
                    } else {
                        i_res++;
                    }
                }
                i_res = 0;
            }
        }

        boolean pars = false;
        while (i_res < arr.length) {
            if (res[i_res][j_res] > 0 && res[i_res][j_res + 1] > 0) {
                System.out.println(res[i_res][j_res] + " " + res[i_res][j_res + 1]);
                pars = true;
            }
            i_res++;
        }
        if (!pars) System.out.println("Numbers missing");
    }
}
