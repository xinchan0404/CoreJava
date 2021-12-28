package com.xinchan.corejava.ch06.lambda;

import java.util.Arrays;

/**
 * This program demonstrates the use of lambda expressions
 *
 * @author xinchan
 * @version 1.0.1 2021-12-28
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
    }
}
