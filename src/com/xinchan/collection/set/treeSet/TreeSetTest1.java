package com.xinchan.collection.set.treeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author xinchan
 * @version 1.0.1 2021-11-24
 */
public class TreeSetTest1 {
    public static void main(String[] args) {
        /*
         * 创建集合
         *  由于 String 类实现了 Comparable 接口（即实现了 compareTo()）,无法修改 compareTo() 只能按照默认规则排序
         *  但是可以通过 Comparator 比较器对象定制比较规则，此处优先根据字符串的长度进行排序，如果长度相等再根据字典排序
         */
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();
                return (len1 - len2 == 0)? o1.compareTo(o2) : len1 - len2;
            }
        });

        /*
         * （1）添加元素
         *  常用添加方法
         *      1. 如果元素不存在，则添加 add(E element)
         */
        System.out.println("----------（1）添加元素----------");
        names.add("zhangsan");
        names.add("lisi");
        names.add("wangwu");
        names.add("zhaoliu");
        names.add("qianqi");
        names.add("zhaoliu");  // 如果元素存在，则添加失败
        System.out.println("元素个数：" + names.size());
        System.out.println(names);

        /*
         * （2）遍历集合
         */
        System.out.println("----------（2）遍历集合----------");
        System.out.println("----------（2）遍历集合（增强 for）----------");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("----------（2）遍历集合（迭代器 iterator）----------");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
         * （3）删除元素
         */
        System.out.println("----------（3）删除元素----------");
        names.remove("qianqi");
        names.remove("zhaoliu");
        System.out.println("元素个数：" + names.size());
        System.out.println(names);

        /*
         * （4）判断集合
         */
        System.out.println("----------（4）判断集合----------");
        System.out.println("集合是否为空：" + names.isEmpty());
        System.out.println("集合是否包含 wangwu：" + names.contains("wangwu"));
        System.out.println("当前集合中第一个元素：" + names.first());
        System.out.println("当前集合中最后一个元素：" + names.last());
        System.out.println("当前集合中严格大于 qianqi 的元素：" + names.higher("qianqi"));
        System.out.println("当前集合中严格小于 qianqi 的元素：" + names.lower("zhaoliu"));
    }
}
