// сумму элементов массива
package hw_2023_02_07;

public class HwOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(sum(arr));
    }
    private static int sum(int[] arr) {
        int sum = 0;
        int j = arr.length - 1;
        if (j == 0) return arr[j];
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] + arr[j];
            j--;
            if (i == j) return sum;
            if (j - 1 == i) return sum + arr[j];
        }
        return sum;
    }
}
