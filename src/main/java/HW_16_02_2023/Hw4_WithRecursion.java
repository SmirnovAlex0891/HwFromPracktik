/**
 * Написать метод который генерирует двумерный массив длиной N и высотой H
 * Далее заполняет получившийся массив числами от 1 до W по спирали.
 * Например массив
 * [ ][ ][ ][ ]
 * [ ][ ][ ][ ]
 * [ ][ ][ ][ ]
 * имеет N == 4 and H == 3 и вид    [ 1 ][ 2 ][ 3 ][ 4 ]
 * [ 10][ 11][ 12][ 5 ]
 * [ 9 ][ 8 ][ 7 ][ 6 ]
 */
package HW_16_02_2023;

public class Hw4_WithRecursion {
    public static void main(String[] args) {
        twoDimensionalArray(5, 9);
    }

    public static void twoDimensionalArray(int n, int m) {
        int[][] arr = new int[n][m];
        int x = 0;
        int y = 0;
        int i = 1;
        ext(n, m, arr, x, y, i);
        for (int j = 0, k = 0; k < n; ) {
            System.out.printf("%-5d", arr[k][j]);
            j++;
            if (j == m) {
                j = 0;
                k++;
                System.out.println();
            }
        }
    }

    private static void ext(int n, int m, int[][] arr, int x, int y, int i) {
        if (x >= m || y >= n) {
            return;
        }
        int xStart = x;
        int yStart = y;
        while (x < m) {
            arr[y][x] = i;
            x++;
            i++;
        }
        if (x == m) {
            x--;
            y++;
            while (y < n) {
                arr[y][x] = i;
                y++;
                i++;
            }
        }
        if (y == n) {
            y--;
            x--;
            while (x > xStart - 1 && y != yStart) {
                arr[y][x] = i;
                x--;
                i++;
            }
        }
        if (x == xStart - 1) {
            x++;
            y--;
            while (y > yStart && x + 1 != m) {
                arr[y][x] = i;
                y--;
                i++;
            }
        }
        ext(n - 1, m - 1, arr, x + 1, y + 1, i);
    }
}
