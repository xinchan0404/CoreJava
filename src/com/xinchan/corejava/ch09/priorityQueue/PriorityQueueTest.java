package com.xinchan.corejava.ch09.priorityQueue;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @author xinchan
 * @version 1.0.1 2021-12-24
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(LocalDate.of(1906, 12, 9));  // G. Hopper
        priorityQueue.add(LocalDate.of(1815, 12, 10));  // A. Lovelace
        priorityQueue.add(LocalDate.of(1903, 12, 3));  // J. von Neumann
        priorityQueue.add(LocalDate.of(1910, 6, 22));  // K. Zuse

        System.out.println("Iterating over elements...");
        for (LocalDate date : priorityQueue) {
            System.out.println(date);
        }

        System.out.println("Removing elements...");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}
