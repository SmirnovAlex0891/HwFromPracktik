package HW_11_05_2023.hw1;

import java.io.*;

/**
 * Создайте программу на Java, которая открывает файл для чтения и выводит его содержимое в консоль.
 * Если файл не найден, программа должна вывести сообщение об ошибке "Файл не найден"
 * и продолжить выполнение программы.
 */
public class Hw1 {
    public static void main(String[] args) {
        String path = "src/main/java/HW_11_05_2023/Text.txt";
        String tmp;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while ((tmp = bufferedReader.readLine()) != null) {
                System.out.println(tmp);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("DONE!!!");
    }
}
