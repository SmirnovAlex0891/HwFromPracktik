package hw_2023_04_25;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hw2 {
    public static void main(String[] args) {
        String[] arr = {"abc", "cde", "efh", "bca", "ffhe"};

        Map<Character, Integer> mapWord = Arrays.stream(arr)
                .flatMap(a -> a.chars().mapToObj(e -> (char) e))
                .collect(HashMap::new, (map, e) -> {
                    if (map.containsKey(e)) {
                        map.put(e, map.get(e) + 1);
                    } else {
                        map.put(e, 1);
                    }
                }, HashMap::putAll);
        for (Map.Entry<Character, Integer> m : mapWord.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}
