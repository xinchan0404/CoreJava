package com.xinchan.corejava.ch03.Input;

import java.util.Scanner;

/**
 * @author zhengxin
 * @version 1.0.1 2021-10-24
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ". Next year, you will be " + (age + 1));
    }
}
