//вам необходимо проверить массив на наличие повторений чисел
package hw_2023_02_09;

import java.util.HashSet;
import java.util.Set;

public class HwTwo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 9, 3, 13, 0, 5};
        int n = 14;
        System.out.println(isDuplicated(arr));
    }

    public static boolean isDuplicated(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;

        while (i < nums.length) {
            if (!set.add(nums[i])) {
                return true;
            }
            i++;
        }
        return false;
    }
}
