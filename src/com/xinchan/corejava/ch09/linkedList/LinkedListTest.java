package com.xinchan.corejava.ch09.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-16
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        LinkedList<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        /*
         * merge the names from b into a
         */
        ListIterator<String> aListIterator = a.listIterator();
        Iterator<String> bIterator = b.iterator();

        while (bIterator.hasNext()) {
            if (aListIterator.hasNext()) {
                aListIterator.next();
            }
            aListIterator.add(bIterator.next());  // 依赖位置的 add 方法
        }

        System.out.println(a);

        /*
         * remove every second name from b
         */
        bIterator = b.iterator();

        while (bIterator.hasNext()) {
            // skip first element
            bIterator.next();
            if (bIterator.hasNext()) {
                bIterator.next();
                bIterator.remove();
            }
        }

        System.out.println(b);

        /*
         * bulk operation: remove all names in b from a
         */
        a.removeAll(b);

        System.out.println(a);
    }
}
