package HW_11_05_2023.hw3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Напишите программу на Java, которая считывает данные из нескольких файлов
 * и записывает их в один файл. Если хотя бы один из файлов не найден, программа
 * должна выбросить исключение FileNotFoundException. Если в процессе чтения или записи файла
 * возникают ошибки ввода-вывода, программа должна выбросить исключение IOException.
 * Если при чтении данных из файла происходит ошибка формата,
 * программа должна выбросить исключение FormatException.
 */
public class Hw3 {
    public static void main(String[] args) {
        List<String> paths = new ArrayList<>(Arrays.asList("src/main/java/HW_11_05_2023/hw3/Text1.txt",
                "src/main/java/HW_11_05_2023/hw3/Text2.txt",
                "src/main/java/HW_11_05_2023/hw3/Text3.txt"));
        String pathOut = "src/main/java/HW_11_05_2023/hw3/Out.txt";
        String tmp;
        Pattern pattern = Pattern.compile("!{2,}?");
        Matcher matcher;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathOut))) {
            BufferedReader reader;
            for (String str : paths) {
                reader = new BufferedReader(new FileReader(str));
                while ((tmp = reader.readLine()) != null) {
                    matcher = pattern.matcher(tmp);
                    if (matcher.find()) {
                        throw new FormatException("Data format error");
                    }
                    writer.write(tmp + "\n");
                }
            }
        } catch (FormatException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
