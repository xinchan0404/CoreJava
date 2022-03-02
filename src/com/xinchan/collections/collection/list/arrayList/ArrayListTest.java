package com.xinchan.collections.collection.list.arrayList;

import com.xinchan.collections.collection.list.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-16
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Student> students = new ArrayList<>();

        // 创建集合元素
        Student zhangsan = new Student("zhangsan", 1);
        Student lisi = new Student("lisi", 2);
        Student wangwu = new Student("wangwu", 3);
        Student zhaoliu = new Student("zhaoliu", 4);

        /*
         * （1）添加元素
         *  常用 add 方法：
         *      1. 在末尾添加 add(E element)
         *      2. 在指定位置添加 add(int index, E element)
         */
        System.out.println("----------添加元素----------");
        students.add(zhangsan);
        students.add(lisi);
        students.add(1, zhaoliu);
        students.add(wangwu);
        System.out.println("元素个数：" + students.size());
        System.out.println(students);

        /*
         * （2）删除元素
         *  常用 remove 方法：
         *      1. 根据位置删除 remove(int index)
         *      2. 根据对象删除 remove(Object o)，可能需要覆盖 equals 方法
         */
        System.out.println("----------（2）删除元素----------");
        students.remove(1);  // 根据位置删除
        students.remove(new Student("zhangsan", 1));  // 根据对象删除
        System.out.println("元素个数：" + students.size());
        System.out.println(students);

        /*
         * （3）遍历集合
         */
        System.out.println("----------（3）遍历集合（普通 for）----------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("----------（3）遍历集合（增强 for）----------");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------（3）遍历集合（迭代器 iterator）----------");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------（3）遍历集合（迭代器 listIterator）----------");
        ListIterator<Student> listIterator = students.listIterator(1);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        /*
         * （4）判断集合
         *  根据对象的实际信息，可能需要覆盖 equals 方法
         */
        System.out.println("----------（4）判断集合----------");
        System.out.println("集合中是否有 lisi：" + students.contains(new Student("lisi", 2)));
        System.out.println("集合是否为空：" + students.isEmpty());

        /*
         * （5）查找元素
         */
        System.out.println("----------（5）查找元素----------");
        students.add(lisi);
        System.out.println("lisi 第一次出现的位置：" + students.indexOf(lisi));
        System.out.println("lisi 最后一次出现的位置：" + students.lastIndexOf(lisi));
    }
}
