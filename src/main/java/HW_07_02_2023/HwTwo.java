// найти минимальный и второй по минимальности
package HW_07_02_2023;

public class HwTwo {
    public static void main(String[] args) {
        int[] arr = {-2,0,7,1,3,-1,9,4,7,1,3};
        getMin(arr);
    }
    private static void getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                if (min < min2) min2 = min;
                min = arr[i];
            }
            if (arr[i] > min && arr[i] < min2) min2 = arr[i];
        }
        System.out.println("min: " + min);
        System.out.println("min2: " + min2);
    }
}
