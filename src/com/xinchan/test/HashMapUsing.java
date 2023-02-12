package com.xinchan.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author xinchan
 * @version 1.0.1 2023-02-11
 */
public class HashMapUsing {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "C");
        map.put(2, "C++");
        map.put(3, "Java");

        // method 1
//        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Integer, String> next = iterator.next();
//            System.out.println(next.getKey() + "-" + next.getValue());
//        }

        // method 2
//        Iterator<Integer> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next + "-" + map.get(next));
//        }

        // method 3
//        for (Map.Entry<Integer, String> entry: map.entrySet()) {
//            System.out.println(entry.getKey() + "-" + entry.getValue());
//        }

        // method 4
//        map.forEach((key, value) -> {
//            System.out.println(key + "-" + value);
//        });

        // method 5
        map.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        });
    }
}
