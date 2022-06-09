package generics;

import enums.sample.HttpStatus;
import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        // 왜 Generic 을 사용해야할까?
        List items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("abc");
        items.add(4);
        items.add(5);

        printItemsDoubled(items);

        System.out.println("=====================");

        List<Integer> integerItems = new ArrayList<>();
        integerItems.add(1);
        integerItems.add(2);
        integerItems.add(3);
        // integerItems.add("abc"); // Compile 시점에서 에러를 잡아줌
        integerItems.add(4);
        integerItems.add(5);

        printIntegerItemsDoubled(integerItems);
    }

    private static void printItemsDoubled(List items) {
        for(Object item : items) {
            System.out.println((Integer) item * 2);
        }
    }

    private static void printIntegerItemsDoubled(List<Integer> items) {
        for(Integer item : items) {
            System.out.println(item * 2);
        }
    }
}
