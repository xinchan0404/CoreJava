//package com.xinchan.corejava.ch07.stackTrace;
//
//import java.util.Scanner;
//
///**
// * A program that displays a trace feature of a recursive method call
// *
// * @author xinchan
// * @version 1.0.1 2022-01-10
// */
//public class StackTraceTest {
//    /**
//     * Computes a factorial of a number
//     *
//     * @param n
//     * @return
//     */
//    public int factorial(int n) {
//        System.out.println("factorial(" + n + "): ");
//        StackWalker walker = StackWalker.getInstance();
//        walker.forEach(System.out::println);
//        int r;
//        if (n <= 1) {
//            r = 1;
//        } else {
//            r = n * factorial(n - 1);
//        }
//        System.out.println("return " + r);
//        return r;
//    }
//
//    public static void main(String[] args) {
//        StackTraceTest stackTraceTest = new StackTraceTest();
//
//        try (Scanner in = new Scanner(System.in)) {
//            System.out.println("Enter n: ");
//            int n = in.nextInt();
//            stackTraceTest.factorial(n);
//        }
//    }
//}
