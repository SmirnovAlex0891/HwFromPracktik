package hw_2023_05_11.hw2;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Напишите программу на Java, которая вычисляет факториал числа, заданного пользователем
 * в качестве входного параметра. Если пользователь ввел отрицательное число, программа
 * должна сгенерировать исключение и вывести сообщение об ошибке "Введено отрицательное число".
 */
public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }
    public static int factorial(int num) {
        if (num < 0) {
            throw new NegativeNumberException(ErrorMessageNegNum.NEGATIVE_NUMBER);
        }
        if (num <= 1) return 1;
        return IntStream.rangeClosed(2, num).reduce((x, y) -> x * y).getAsInt();
    }
}
