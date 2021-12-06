package com.xinchan.corejava.ch09.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author xinchan
 * @version 1.0.1 2021-11-25
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        long totalTime = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                long startMs = System.currentTimeMillis();
                words.add(word);
                long timeCost = System.currentTimeMillis() - startMs;
                totalTime += timeCost;
            }
        }

        Iterator<String> iterator = words.iterator();
        for (int i = 0; i < 20 && iterator.hasNext(); i++) {
            System.out.println(iterator.next());
        }
        System.out.println("...");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
    }
}
