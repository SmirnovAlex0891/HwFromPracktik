package hw_2023_04_18;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * String text = "???";
 * И вывести на экран все уникальные слова и количество их повторений
 * отсортировать в порядке убывания.
 * Так же подсчитать количество всех слов
 * Ex:
 * mama - 2
 * is - 3
 * i - 3
 * throw - 1
 */
public class Hw1 {
    public static void main(String[] args) {
        String text;
        String tmp;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\TelRan\\Java\\HwFromPracktik\\src\\main\\java\\HW_18_04_2023\\Text.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\TelRan\\Java\\HwFromPracktik\\src\\main\\java\\HW_18_04_2023\\NewText.txt"))) {
            while ((tmp = reader.readLine()) != null) {
                writer.write(tmp);
                sb.append(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        text = sb.toString();
        //text = text.toLowerCase().replaceAll("(\\.)|(,)|(X)|(I)|(V)|(\\[)|(\\])|(\\*)|(\\()|(\\))|(–)|(!)|(\\?)|(;)|(:)|(«)|(»)|(…)", "");
        List<String> words = Arrays.asList(text.split("\\P{L}+"));
        Map<String, Integer> map = words.stream()
                .collect(HashMap::new, (m, w) -> {
                    if (m.containsKey(w)) {
                        m.put(w, m.get(w) + 1);
                    } else {
                        m.put(w, 1);
                    }
                }, HashMap::putAll);
//        map.forEach((k, v) -> System.out.println(k + " : " + v));
        map.entrySet().stream().sorted((e1, e2) -> e2.getValue() - e1.getValue()).forEach(System.out::println);
        System.out.println(Arrays.stream(text.split(" ")).count());

    }
}
