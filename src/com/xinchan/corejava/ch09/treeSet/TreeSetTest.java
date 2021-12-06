package com.xinchan.corejava.ch09.treeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author xinchan
 * @version 1.0.1 2021-11-25
 */
public class TreeSetTest {
    public static void main(String[] args) {
        /*
         * 创建集合
         * Item 类需要实现 Comparable 接口、覆盖 compareTo()
         */
        TreeSet<Item> parts = new TreeSet<>();

        /*
         * 添加元素
         */
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));

        /*
         * 遍历集合
         */
        Iterator<Item> iterator = parts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
         * 创建集合，传入 Comparator 比较器对象，根据 description 排序
         */
        TreeSet<Item> sortByDescription = new TreeSet<>(Comparator.comparing(Item::getDescription));  // 没懂

        sortByDescription.addAll(parts);

        /*
         * 遍历集合
         */
        for (Item i : sortByDescription){
            System.out.println(i);
        }
    }
}
