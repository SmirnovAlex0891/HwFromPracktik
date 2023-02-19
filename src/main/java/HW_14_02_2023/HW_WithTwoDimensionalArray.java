//AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
//**ДОБАВИТЬ ПРОВЕРКУ
package HW_14_02_2023;

public class HW_WithTwoDimensionalArray {
    public static void main(String[] args) {
        String str = "AAASSDDFFRRTGGBNHYUUU";
        System.out.println(getNewString(str));
    }

    public static String getNewString(String s) {

        int[][] arr = new int[s.length()][2];
        int kurs = 0;
        boolean flag;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                flag = true;
                for (int j = 0; j <= kurs; j++) {
                    if (arr[j][0] == 0) {
                        arr[j][0] = s.charAt(i);
                        arr[j][1]++;
                    } else if (arr[j][0] == s.charAt(i)) {
                        arr[j][1]++;
                    } else if (j == kurs && flag) {
                        kurs++;
                        flag = false;
                    }
                }
            } else {
                System.out.println("Only letters!");
                return null;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] != 0) {
                sb.append(arr[i][1]).append((char) arr[i][0]);
            }
        }
        return sb.toString();
    }
}
