package com.xinchan.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2023-02-11
 */
public class Array2List {
    public static void main(String[] args) {
//        // array to list 1
//        int[] ints = new int[]{1, 2, 3, 4};
//        List<Integer> list = new ArrayList<>();
//        for (int anInt : ints) {
//            list.add(anInt);
//        }
//        System.out.println(Arrays.toString(list.toArray()));
//
//        // array to list 2
//        String[] strings = new String[] {"a", "b", "c", "d"};
//        List<String> list1 = Arrays.asList(strings);
//        System.out.println(Arrays.toString(list1.toArray()));

        // list to array 1
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        System.out.println(Arrays.toString(ints));

        // list to array 2
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        String[] strings = list1.toArray(new String[0]);
        System.out.println(Arrays.toString(strings));
    }
}
