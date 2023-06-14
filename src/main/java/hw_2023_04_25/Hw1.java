package hw_2023_04_25;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Hw1 {
    static List<int[]> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {12,4,17,3,15,1,19,3,26};

        int num = 20;
        IntStream.range(0, arr.length)
                .forEach(i -> IntStream.range(0, arr.length)
                        .filter(j -> i != j && arr[i] + arr[j] == num)
                        .forEach(j -> addPairs(arr[i], arr[j]))
                );
        list.stream().distinct().forEach(ar -> System.out.print(ar[0] + ", " + ar[1]));
    }
    static void addPairs(int a, int b) {
        int[] tmp = {a, b};
        list.add(tmp);
    }
}
