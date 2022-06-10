package generics;

import enums.sample.HttpStatus;
import generics.sample.GenericUtil;
import generics.sample.TExtendsClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GenericsMain {
    public static void main(String[] args) {
        // 왜 Generic 을 사용해야할까?
        // 1. Stronger type checks at compile time.
        // 2. Elimination of casts.
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

        System.out.println("=====================");
        System.out.println("Wildcard");
        System.out.println("=====================");
        List<String> list = new ArrayList<>();
        list.add("wildcard1");
        list.add("wildcard2");
        list.add("wildcard3");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // 다양한 형태들 (1) <?>
        GenericUtil.printWildCard(list);
        GenericUtil.printWildCard(list2);

        System.out.println("=====================");
        System.out.println("Wildcard extends class");
        System.out.println("=====================");

        // 다양한 형태들 (2) <? extends class>
        //GenericUtil.printWildCardExtendsClass(list);
        GenericUtil.printWildCardExtendsClass(list2);

        System.out.println("=====================");
        System.out.println("Wildcard super class");
        System.out.println("=====================");

        List<Double> list3 = new ArrayList<>();
        list3.add(1.1);
        list3.add(1.3);

        List<Number> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(1.5);

        // 다양한 형태들 (3) <? super class>
        GenericUtil.printWildCardSuperClass(list2);
        //GenericUtil.printWildCardSuperClass(list3);
        GenericUtil.printWildCardSuperClass(list4);


        System.out.println("=====================");
        System.out.println("T extends Class");
        System.out.println("=====================");
        // T extends Class
        // TExtendsClass<String> abc = new TExtendsClass<>("abc");
        TExtendsClass<Integer> tExtendsClass = new TExtendsClass<>(50);
        System.out.println(tExtendsClass.getValue());

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
