package HW_23_02_2023;

/**
 * Пирамида паскаля заполнялась по ф-ле
 * <p>
 *  k      n!
 * C = ----------
 *  n   k!*(n-k)!
 */
public class Hw2 {
    public static void main(String[] args) {
        int height = 15;
        pascalPyramid(height);
    }

    public static void pascalPyramid(int height) {
        int[][] arr = new int[height][];
        for (int i = 0; i < height; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (getFactorial(i) / (getFactorial(j) * getFactorial(i - j)));
                System.out.printf("%-5d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static long getFactorial(int f) {
        long result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
