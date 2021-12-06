package com.xinchan.corejava.ch05.enums;

import java.util.Scanner;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-06
 */
public class EnumTest {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");

        String input = scanner.next().toUpperCase();

        Size s = Enum.valueOf(Size.class, input);
        System.out.println("size=" + s);
        System.out.println("abbreviation=" + s.getAbbreviation());

        if (s == Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the _");
        }
    }
}
