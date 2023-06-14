package hw_2023_05_09;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arrTran = Tasks.transpose(arr);
        Arrays.stream(arrTran).map(Arrays::toString).forEach(System.out::println);
        System.out.println("**************************************");

        int[][] arrRotate = Tasks.rotate(arr);
        Arrays.stream(arrRotate).map(Arrays::toString).forEach(System.out::println);
        System.out.println("**************************************");

        int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(Tasks.sumUD(arr2));
        System.out.println("**************************************");

        int[] arr3 = {2, 4, 6, 7, 8, 9, 12, 15, 21, 23};
        int[] arr4 = {1, 3, 5, 10, 11, 19, 20};
        System.out.println(Tasks.mergeAndMedian(arr3, arr4));
    }

}
