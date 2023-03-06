//AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
//**ДОБАВИТЬ ПРОВЕРКУ
package HW_14_02_2023;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.Map;

public class HwWithCharacterIterator {
    public static void main(String[] args) {
        String str = "AAASSDDFFRRTGGBNHYUUU";
        System.out.println(getNewString(str));
    }

    public static String getNewString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        CharacterIterator it = new StringCharacterIterator(s);

        while (it.current() != CharacterIterator.DONE) {
            if (it.current() >= 'A' && it.current() <= 'Z' || it.current() >= 'a' && it.current() <= 'z') {
                if (map.containsKey(it.current())) {
                    map.put(it.current(), map.get(it.current()) + 1);
                } else {
                    map.put(it.current(), 1);
                }
            } else {
                System.out.println("Only letters!");
                return null;
            }
            it.next();
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getValue()).append(entry.getKey());
        }
        return sb.toString();
    }
}
