package HW_15_03_2023;

import java.util.Scanner;

public class PingPong {

    static int a = 15;
    static int b = 40;
    static int start = 4;
    static int[][] arr = new int[a][b];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        pingPong();

    }

    public static void pingPong() {
        int x = 0;
        int y = start;
        boolean xUp = true;
        boolean yUp = true;
        while (true) {
            arr[y][x] = 8;

//            if (arr[y][x] == 8) {
//                arr[y][x] = 1;
//            } else {
//                arr[y][x] = 8;
//            }
            //breakPoint();
            //printArr();

            if (y == 0 && x == 0) {
                System.out.println("Top left corner");
                break;
            } else if (y == 0 && x == b - 1) {
                System.out.println("Top right corner");
                break;
            } else if (y == a - 1 && x == 0) {
                System.out.println("Lower left corner");
                break;
            } else if (y == a - 1 && x == b - 1) {
                System.out.println("Lower right corner");
                break;
            }

            if (yUp) {
                if (y + 1 < a) {
                    y++;
                } else {
                    y--;
                    yUp = false;
                }
            } else {
                if (y - 1 >= 0) {
                    y--;
                } else {
                    y++;
                    yUp = true;
                }
            }
            if (xUp) {
                if (x + 1 < b) {
                    x++;
                } else {
                    x--;
                    xUp = false;
                }
            } else {
                if (x - 1 >= 0) {
                    x--;
                } else {
                    x++;
                    xUp = true;
                }
            }
        }
        printArr();
    }

    public static void printArr() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void breakPoint() {
        System.out.println("Enter number");
        int x = scanner.nextInt();
        System.out.println("************************" + x);
    }
}
