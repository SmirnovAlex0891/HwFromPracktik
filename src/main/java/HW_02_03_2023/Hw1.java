package HW_02_03_2023;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw1 {
    private static List<Integer> list = new ArrayList<>();
    private static final int numLet = 5;

    public static void main(String[] args) {
        fillRandomNumbers();
        printOnlyEven();
        printOnlyOdd();
        char s = 'X';
        String str = genWord();
        System.out.println(str);
        findLetter(str, s);

    }

    public static void fillRandomNumbers() {
        for (int i = 0; i < 50; i++) {
            list.add((int) (Math.random() * (100 - 1) + 1));
        }
    }

    public static void printOnlyEven() {
        Iterator<Integer> it = list.iterator();
        int tmp;
        while (it.hasNext()) {
            tmp = it.next();
            if (tmp % 2 == 0) System.out.print(tmp + ", ");
        }
        System.out.println();
    }

    public static void printOnlyOdd() {
        Iterator<Integer> it = list.iterator();
        int tmp;
        while (it.hasNext()) {
            tmp = it.next();
            if (tmp % 2 == 1) System.out.print(tmp + ", ");
        }
        System.out.println();
    }

    public static String genWord() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numLet; i++) {
            s.append((char) (Math.random() * (90 - 65) + 65));
        }
        return s.toString();
    }

    public static void findLetter(String s, char c) {
        CharacterIterator it = new StringCharacterIterator(s, s.length());
        char tmp;
        while (it.getIndex() != 0) {
            tmp = it.previous();
            if (tmp == c) {
                System.out.println("Find symbol: " + tmp);
                return;
            }
        }
        System.out.println("Symbol " + c + " not found!");
    }
}
