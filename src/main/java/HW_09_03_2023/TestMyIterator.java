package HW_09_03_2023;

import java.util.ArrayList;
import java.util.List;

public class TestMyIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        MyIterator<Integer> myIt = new MyIterator<>(list);

        while (myIt.hasNext()) {
            System.out.println(myIt.next());
        }
        System.out.println("**********************************");
        myIt.remove();
        myIt.remove();
        myIt.remove();
        while (myIt.hasPrevious()) {
            System.out.println(myIt.previous());
        }
        System.out.println(list);

    }
}
