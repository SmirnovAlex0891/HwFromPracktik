package HW_28_02_2023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Hw1 {
    private static final List<String> pal = new ArrayList<>();
    private static final List<String> notPal = new ArrayList<>();
    private static final int numLet = 4;

    public static void main(String[] args) {
        wordCheck(allWords());
        print("Not a Palindrome", notPal);
        print("Palindrome", pal);
    }

    public static void print(String s, List<String> list) {
        Iterator<String> listIt = list.iterator();
        while (listIt.hasNext()) {
            System.out.println(listIt.next() + " : " + s);
        }
    }

    public static void wordCheck(List<String> list) {
        for (String s : list) {
            if (isPalindrom(s)) {
                pal.add(s);
            } else {
                notPal.add(s);
            }
        }
    }

    public static List<String> allWords() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(genWord());
        }
        return list;
    }

    public static String genWord() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numLet; i++) {
            s.append((char) (Math.random() * (90 - 65) + 65));
        }
        return s.toString();
    }

    public static boolean isPalindrom(String s) {
        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            characters.add(c);
        }
        boolean f = true;
        ListIterator<Character> liStart = characters.listIterator();
        ListIterator<Character> liEnd = characters.listIterator(characters.size());
        while (liStart.hasNext() && liEnd.hasPrevious() && liStart.nextIndex() < liEnd.nextIndex()) {
            if (!liStart.next().equals(liEnd.previous())) f = false;
        }
        return f;
    }
}
