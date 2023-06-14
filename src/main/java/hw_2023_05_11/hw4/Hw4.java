package hw_2023_05_11.hw4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Напишите программу на Java для чтения содержимого текстового файла и подсчета количества слов в каждой строке.
 * Однако, программа должна быть написана с использованием обработки исключений, чтобы обрабатывать ошибки,
 * связанные с открытием файла, чтением содержимого файла и любыми другими исключениями,
 * которые могут возникнуть при выполнении программы. В случае возникновения исключения,
 * программа должна выводить соответствующее сообщение об ошибке и продолжать работу с другими строками файла.
 */
public class Hw4 {
    public static void main(String[] args) {
        //String path = "src/main/java/HW_11_05_2023/hw4/";
        Scanner scanner = new Scanner(System.in);
        List<Integer> numWords = new ArrayList<>();
        String tmp;
        Pattern pattern = Pattern.compile("�{2,}?");
        Matcher matcher;
        boolean flag = true;
        while (flag) {
            String path = "src/main/java/HW_11_05_2023/hw4/";
            System.out.println("Enter file name:");
            String pathAdd = scanner.nextLine();
            path = path + pathAdd;
            System.out.println(path);
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                while ((tmp = reader.readLine()) != null) {
                    matcher = pattern.matcher(tmp);
                    try {
                        if (matcher.find()) {
                            throw new FormatException("Data format error");
                        }
                        numWords.add((int) Arrays.stream(tmp.split("\\P{L}+")).count());
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
                flag = false;
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(numWords);
    }
}
