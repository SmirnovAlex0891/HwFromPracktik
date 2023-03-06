// * дан массив, надо:
// * - если массив длины больше чем 4 - 3ий, и  4ий по минимальности элемент
// * если меньше то сообщение что массив меньше
package HW_07_02_2023;

public class HwThree {
    public static void main(String[] args) {
        int[] arr = {1,-1,1,16,2,2,2,2,15,115};
        getMin(arr);
    }
    private static void getMin(int[] arr) {
        if (arr.length < 4) {
            System.out.println("arr < 4");
        }else {
            int min = Integer.MAX_VALUE;
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            int min3 = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min3 = min2;
                    min2 = min1;
                    min1 = min;
                    min = arr[i];
                }else if (arr[i] > min && arr[i] < min1) {
                    min3 = min2;
                    min2 = min1;
                    min1 = arr[i];
                }else if (arr[i] > min1 && arr[i] < min2) {
                    min3 = min2;
                    min2 = arr[i];
                }else if (arr[i] > min2 && arr[i] < min3) {
                    min3 = arr[i];
                }
            }
            if (min2 == Integer.MAX_VALUE) {
                System.out.println("third missing");
            }else {System.out.println("third: " + min2);}
            if (min3 == Integer.MAX_VALUE) {
                System.out.println("fourth missing");
            }else {System.out.println("fourth: " + min3);}
        }

    }
}
