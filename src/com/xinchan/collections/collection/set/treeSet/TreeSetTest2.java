package com.xinchan.collections.collection.set.treeSet;

import com.xinchan.collections.collection.set.Student;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author xinchan
 * @version 1.0.1 2021-11-23
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        /*
         * 创建集合
         *  Student 类需要实现 Comparable 接口来定制比较规则
         *  此处规则：先按照字典顺序比较 name（先按照字典顺序，再按照长度），再按照数值大小比较 age
         */
        TreeSet<Student> students = new TreeSet<>();

        /*
         * 创建集合元素
         */
        Student zhangsan18 = new Student("zhangsan", 18);
        Student zhangsan20 = new Student("zhangsan", 20);
        Student lisi22 = new Student("lisi", 22);
        Student lisi24 = new Student("lisi", 24);
        Student wangwu = new Student("wangwu", 26);

        /*
         * （1）添加元素
         *  常用添加方法
         *      1. 如果元素不存在，则添加 add(E element)
         */
        System.out.println("----------（1）添加元素----------");
        students.add(zhangsan18);
        students.add(zhangsan20);
        students.add(lisi22);
        students.add(lisi24);
        students.add(wangwu);
        System.out.println("元素个数：" + students.size());
        System.out.println(students);

        /*
         * （2）遍历集合
         */
        System.out.println("----------（2）遍历集合----------");
        System.out.println("----------（2）遍历集合（增强 for）----------");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------（2）遍历集合（迭代器 iterator）----------");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
         * （3）删除元素
         */
        System.out.println("----------（3）删除元素----------");
        students.remove(lisi22);
        students.remove(zhangsan18);
        // 需要根据实际需求，覆盖类的 hashCode() 和 equals()
        students.remove(new Student("wangwu", 26));  // 如果不覆盖，删除失败
        System.out.println("元素个数：" + students.size());
        System.out.println(students);

        /*
         * （4）判断集合
         */
        System.out.println("----------（4）判断集合----------");
        System.out.println("集合是否为空：" + students.isEmpty());
        System.out.println("集合是否包含 zhangsan20：" + students.contains(zhangsan20));
        System.out.println("集合是否包含 zhangsan20：" + students.contains(new Student("zhangsan", 20)));
        System.out.println("当前集合中严格大于 lisi24 的元素：" + students.higher(new Student("lisi", 24)));
        System.out.println("当前集合中严格小于 lisi24 的元素：" + students.lower(new Student("lisi", 24)));
    }
}
