package hw_2023_03_16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String[] sa = {"2,5", "1-3,8", "4", "5-9", "7,9-2"};
 * String[] newA = {"25", "1238", "4", "56789", "798765432"};
 * Преобразовать массив |sa| в массив |newA|
 */
public class hwString {
    public static void main(String[] args) {
        String[] sa = {"2,5", "1-3,8", "4", "5-9", "7,9-2"};

        printArrStr(sa);
        transformArrStr(sa);
        printArrStr(sa);
    }

    public static void printArrStr(String[] arrS) {
        for (String s : arrS) {
            System.out.print("\"" + s + "\" ");
        }
        System.out.println();
    }

    public static void transformArrStr(String[] aStr) {
        for (int i = 0; i < aStr.length; i++) {
            String strForMet = aStr[i];
            aStr[i] = transformString(strForMet);
        }
    }

    public static String transformString(String x) {
        x = x.replace(",", "");
        String tmp;
        String res;
        Pattern pattern = Pattern.compile("\\d-\\d");
        Matcher matcher = pattern.matcher(x);
        if (matcher.find()) {
            tmp = matcher.group();
            res = x.replaceAll(tmp, trReg(tmp));
        } else {
            res = x;
        }
        return res;
    }

    public static String trReg(String x) {
        StringBuilder sb = new StringBuilder();
        String[] xArr = x.split("\\W");
        int start = Integer.parseInt(xArr[0]);
        int stop = Integer.parseInt(xArr[1]);
        if (start < stop) {
            for (int i = start; i <= stop; i++) {
                sb.append(i);
            }
        } else {
            for (int i = start; i >= stop; i--) {
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
