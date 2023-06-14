package hw_2023_05_09;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TasksTest {

    private static final int[][] ARR = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    @org.junit.jupiter.api.Test
    void transposePositiveTest() {
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] actual = Tasks.transpose(ARR);
        Assertions.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void transposeNegativeTest() {
        int[][] arr = null;
        Assertions.assertThrows(NullPointerException.class, () -> Tasks.transpose(arr));
    }

    @org.junit.jupiter.api.Test
    void rotatePosTest() {
        int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        int[][] actual = Tasks.rotate(ARR);
        Assertions.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void rotateNegTest() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        Assertions.assertThrows(IncorrectIndexArray.class, () -> Tasks.rotate(arr));
    }

    @org.junit.jupiter.api.Test
    void sumUDPosTest() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        List<Integer> actual = Tasks.sumUD(arr);
        List<Integer> expected = new ArrayList<>(Arrays.asList(36, 66));
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumUDNegTest() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Assertions.assertThrows(IncorrectIndexArray.class, () -> Tasks.sumUD(arr));
    }

    @org.junit.jupiter.api.Test
    void mergeAndMediaPosTest() {
        int[] arr3 = {2, 4, 6, 7, 8, 9, 12, 15, 21, 23, 25};
        int[] arr4 = {1, 3, 5, 10, 11, 19, 20};
        int actual = Tasks.mergeAndMedian(arr3, arr4);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void mergeAndMediaNegTest() {
        int[] arr3 = null;
        int[] arr4 = {1, 3, 5, 10, 11, 19, 20};
        Assertions.assertThrows(NullPointerException.class, () -> Tasks.mergeAndMedian(arr3, arr4));
    }


}