package com.xinchan.collection.set.hashSet;

import com.xinchan.collection.set.Student;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author zhengxin
 * @version 1.0.1 2021-11-22
 */
public class HashSetTest {
    public static void main(String[] args) {
        // 创建集合
        HashSet<Student> students = new HashSet<>();

        // 创建集合元素
        Student zhangsan = new Student("zhangsan", 18);
        Student lisi = new Student("lisi", 20);
        Student wangwu = new Student("wangwu", 22);
        Student zhaoliu = new Student("zhaoliu", 24);

        /*
         * （1）添加元素
         *  常用添加元素方法：
         *      1. 如果元素不存在，则添加 add(E element)
         */
        System.out.println("----------（1）添加元素----------");
        students.add(zhangsan);
        students.add(zhangsan);  // 如果元素已经存在，添加失败
        students.add(new Student("zhangsan", 18));  // 如果元素已经存在，添加失败
        students.add(lisi);
        students.add(wangwu);
        students.add(zhaoliu);
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
         *  常用删除方法
         *      1. 如果元素存在，则删除 remove(Object o)
         */
        System.out.println("----------（3）删除元素----------");
        students.remove(zhangsan);
        // 在实际环境下，需要重写 Student 类的 hashCode() 和 equals()
        /*
         * (1) 执行 hashCode 方法计算对象的 hashcode 值并进一步计算其预计存储位置。如果此位置为空，则直接保存，如果不为空，执行下一步。
         * (2) 执行 equals 方法。如果equals 方法返回 true，则认为该桶（bucket）中已经存在该对象，如果返回 false，则形成链表。
         */
        students.remove(new Student("lisi", 20));  // 删除成功
        students.remove(new Student("wangwu", 20));  // 删除失败
        System.out.println("元素个数：" + students.size());
        System.out.println(students);

        /*
         * （4）判断集合
         *  根据对象的实际信息，可能需要覆盖 hashCode() 和 equals()
         */
        System.out.println("----------（4）判断集合----------");
        System.out.println("集合是否为空：" + students.isEmpty());
        System.out.println("集合中是否包含 wangwu(22)：" + students.contains(new Student("wangwu", 22)));
        System.out.println("集合中是否包含 zhaoliu(22)：" + students.contains(new Student("zhaoliu", 22)));
    }
}
