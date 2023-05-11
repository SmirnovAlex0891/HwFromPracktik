package HW_09_05_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {
    /**
     * [1 2 3]
     * [4 5 6]
     * -------
     * [1 4]
     * [2 5]
     * [3 6]
     * **********
     * [1 2 3]
     * [4 5 6]
     * [7 8 9]
     * --------
     * [1 4 7]
     * [2 5 8]
     * [3 6 9]
     */

    public static int[][] transpose(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException();
        }
        int row = matrix[0].length;
        int colum = matrix.length;
        int[][] res = new int[row][colum];
        for (int i = 0; i < colum; i++) {
            for (int j = 0; j < row; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }

    /**
     * [1 2 3]
     * [4 5 6]
     * [7 8 9]
     * ---------
     * [7 4 1]
     * [8 5 2]
     * [9 6 3]
     */

    public static int[][] rotate(int[][] matrix) {
        int y = matrix.length;
        if (y != matrix[0].length) {
            throw new IncorrectIndexArray(ErrorMessage.INCORRECT_INDEX_ARRAY);
        }
        int[][] res = new int[y][y];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = matrix[y - 1 - j][i];
            }
        }
        return res;
    }

    /**
     * [ 1  2  3  4]
     * [ 5  6  7  8]
     * [ 9 10 11 12]
     * [13 14 15 16]
     * ---------
     * sum D
     * sum U
     */

    public static List<Integer> sumUD(int[][] matrix) {
        int row = matrix[0].length;
        int colum = matrix.length;
        if (row != colum) {
            throw new IncorrectIndexArray(ErrorMessage.INCORRECT_INDEX_ARRAY);
        }
        int up = 0;
        int down = 0;
        for (int i = 0; i < colum; i++) {
            for (int j = 0; j < row; j++) {
                if (j > i) {
                    up += matrix[i][j];
                } else if (i > j) {
                    down += matrix[i][j];
                }
            }
        }
        return new ArrayList<>(Arrays.asList(up, down));
    }

    /**
     * Объединить два отсортированных массива в третий отсортированный и найти медианный элемент. Sort использовать нельзя.
     */

    public static int mergeAndMedian(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new NullPointerException();
        }
        int first = 0;
        int second = 0;
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < res.length; i++) {
            if (first < arr1.length && second < arr2.length) {
                if (arr1[first] < arr2[second]) {
                    res[i] = arr1[first++];
                } else {
                    res[i] = arr2[second++];
                }
            } else if (first == arr1.length) {
                res[i] = arr2[second++];
            } else if (second == arr2.length) {
                res[i] = arr1[first++];
            }

        }
        if (res.length % 2 == 0) {
            first = res.length / 2;
            second = first + 1;
            return (res[first] + res[second]) / 2;
        } else {
            first = res.length / 2;
            return res[first];
        }

//        first = 0;
//        second = res.length - 1;
//        while (true) {
//            if (first + 1 == second) {
//                return (res[first] + res[second]) / 2;
//
//            } else if (first == second) {
//                return res[first];
//
//            }
//            first++;
//            second--;
//        }
    }
}
