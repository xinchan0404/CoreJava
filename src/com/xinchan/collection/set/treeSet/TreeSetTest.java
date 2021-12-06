package com.xinchan.collection.set.treeSet;

import com.xinchan.collection.set.Student;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 测试 TreeSet
 * @author xinchan
 * @version 1.0.1 2021-11-23
 */
public class TreeSetTest {
    public static void main(String[] args) {
        /*
         * 创建集合
         *  由于 String 类实现了 Comparable 接口（即实现了 compareTo 方法）
         *  因此，默认按照字符串的字典顺序排序，如果前 n 个字符字典顺序一致，则按照字符串长度排序
         */
        TreeSet<String> names = new TreeSet<>();

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
        names.remove("zhangsan");
        names.remove("lisi");
        System.out.println("元素个数：" + names.size());
        System.out.println(names);

        /*
         * （4）判断集合
         */
        System.out.println("----------（4）判断集合----------");
        System.out.println("集合是否为空：" + names.isEmpty());
        System.out.println("集合中是否包含 zhaoliu：" + names.contains("zhaoliu"));
        System.out.println("当前集合中第一个元素：" + names.first());
        System.out.println("当前集合中最后一个元素：" + names.last());
        System.out.println("当前集合中严格大于 qianqi 的元素：" + names.higher("qianqi"));
        System.out.println("当前集合中严格小于 qianqi 的元素：" + names.lower("zhaoliu"));
    }
}
