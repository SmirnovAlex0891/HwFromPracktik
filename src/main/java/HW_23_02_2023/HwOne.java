package HW_23_02_2023;

/**
 * 1. Сделать генератор островов
 * 2. Посчитать кол-во островов
 * 3. Вывести площадь самого большого острова
 */
public class HwOne {
    static int square = 0;
    static int biggestIsland = 0;

    public static void main(String[] args) {
        int x = 15;
        int y = 10;

        int[][] arr = generArr(x, y);
        System.out.println("Number of islands: " + searchForIslands(arr));
        System.out.println("Biggest island: " + biggestIsland);
    }

    public static int[][] generArr(int x, int y) {
        int[][] arr = new int[y][x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                arr[i][j] = (int) (Math.random() * 2);
                System.out.printf("%-2d", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    public static int searchForIslands(int[][] arr) {
        int numberOfIslands = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    square = 0;
                    if (isIsland(arr, i, j)) {
                        numberOfIslands++;
                        if (biggestIsland < square) {
                            biggestIsland = square;
                        }
                    }
                }
            }
        }
        return numberOfIslands;
    }

    public static boolean isIsland(int[][] arr, int y, int x) {
        boolean flag = true;
        if ((x == 0 || x == arr[y].length - 1 || y == 0 || y == arr.length - 1) && (arr[y][x] == 1 || arr[y][x] == 2)) {
            arr[y][x] = 2;
            return false;
        } else if (arr[y][x] == 0 || arr[y][x] == 2) {
            return true;
        } else {
            arr[y][x] = 2;
            square++;
            if (!isIsland(arr, y - 1, x)) flag = false; /** Search Up */
            if (!isIsland(arr, y + 1, x)) flag = false; /** Search Down */
            if (!isIsland(arr, y, x - 1)) flag = false; /** Search Left */
            if (!isIsland(arr, y, x + 1)) flag = false; /** Search Right */
        }
        return flag;
    }
}
