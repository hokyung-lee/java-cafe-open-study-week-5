package enums;

import enums.sample.HttpStatus;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println(HttpStatus.OK);
        System.out.println(HttpStatus.CREATED);
        System.out.println(HttpStatus.NOT_FOUND);

        System.out.println("===============");

        System.out.println(HttpStatus.valueOf("OK"));
        System.out.println(HttpStatus.valueOf("CREATED"));
        System.out.println(HttpStatus.valueOf("NOT_FOUND"));

        System.out.println("===============");

        HttpStatus[] allValues = HttpStatus.values();

        for (HttpStatus value : allValues) {
            System.out.println(value);
        }
    }
}