package HW_23_03_2023;

import java.util.List;

/**
 * 2(AB3(AB)AB) --> 2(ABABABABAB) --> ABABABABABABABABABAB
 */

public class Hw1 {
    static String res = "";
    public static void main(String[] args) {
        String s = "AB2(AB3(AB)AB)";
        int point = 0;
        //System.out.println(editString(s, point));

    }
    public static String editString(String s, int point) {
        while (point < s.length()) {
            if (!Character.isDigit(s.charAt(point))) {
                res += s.charAt(point);
                point++;
            } else {
                int temp = Integer.parseInt(String.valueOf(s.charAt(point)));
                point++;
                res += dop(s, point, temp);
            }

        }
        return res;
    }
    public static String dop(String s, int point, int value) {
        String dopRes = "";
        while (value > 0) {
            dopRes += s.charAt(point);
        }
        return dopRes;
    }
}
