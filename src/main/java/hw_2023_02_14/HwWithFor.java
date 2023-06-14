//AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
//**ДОБАВИТЬ ПРОВЕРКУ
package hw_2023_02_14;

import java.util.HashMap;
import java.util.Map;

public class HwWithFor {
    public static void main(String[] args) {
        String str = "AAASSDDFFRRTGGBNHYUUU";
        System.out.println(getNewString(str));
    }

    public static String getNewString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            } else {
                System.out.println("Only letters!");
                return null;
            }

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getValue()).append(entry.getKey());
        }
        return sb.toString();
    }
}
