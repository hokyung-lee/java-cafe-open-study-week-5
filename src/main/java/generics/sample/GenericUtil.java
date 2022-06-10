package generics.sample;

import java.util.List;

public class GenericUtil {
    public static void printWildCard(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // 1
    public static void printWildCardExtendsClass(List<? extends Number> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // 2
/*    public static <T extends Number> void printWildCardExtendsClass(List<T> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }*/

    public static void printWildCardSuperClass(List<? super Integer> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
