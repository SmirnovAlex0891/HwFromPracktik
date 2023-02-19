//[1 1 5 4 1 9 2 4 6] n = 11
//вернуть длину минимальной последовательности
//которая в сумме дает n
//в массиве все числа положительные

package HW_09_02_2023;

public class Hw3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 5, 4, 1, 9, 2, 10, 6};
        int n = 11;
        System.out.println(getMinSequence(arr, n));
    }

    public static int getMinSequence(int[] nums, int n) {
        int minSeq = Integer.MAX_VALUE;
        int tmpSeq;
        int tmp;
        int j;

        for (int i = 0; i < nums.length; i++) {
            j = i;
            tmp = 0;
            tmpSeq = 0;
            while (j < nums.length) {
                tmp = tmp + nums[j];
                tmpSeq++;
                if (tmp > n) {
                    tmpSeq = nums.length;
                    break;
                }
                if (tmp == n) {
                    break;
                } else {
                    j++;
                }
            }
            if (tmp == n && minSeq > tmpSeq) minSeq = tmpSeq;
        }
        if (minSeq < Integer.MAX_VALUE) return minSeq;
        return -1;
    }
}
