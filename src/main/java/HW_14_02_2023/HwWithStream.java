//AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
//**ДОБАВИТЬ ПРОВЕРКУ
package HW_14_02_2023;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HwWithStream {
    public static void main(String[] args) {
        String str = "AAASSDDFFRRTGGBNHYUUU";
        System.out.println(getNewString(str));
    }

    public static String getNewString(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = s.chars().
                map(e -> {
                    if (e < 'A' || e > 'Z' && e < 'a' || e > 'z') {
                        try {
                            throw new IOException();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    return e;
                })
                .mapToObj(e -> (char) e)
                .collect(HashMap::new, (m, letter) -> {
                    if (m.containsKey(letter))
                        m.put(letter, m.get(letter) + 1);
                    else
                        m.put(letter, 1);
                }, HashMap::putAll);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getValue()).append(entry.getKey());
        }
        return sb.toString();
    }
}
