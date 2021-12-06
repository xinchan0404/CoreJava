package com.xinchan.corejava.ch04.StaticTest;

/**
 * @author zegxn
 * @version 1.0.1 2021-10-31
 */
public class StaticTest {
    public static void main(String[] args) {
        Employee[] staffs = new Employee[3];

        staffs[0] = new Employee("zhangsan", 1000);
        staffs[1] = new Employee("lisi", 2000);
        staffs[2] = new Employee("wangwu", 3000);

        for (Employee staff : staffs) {
            System.out.println(staff);
        }

        int id = Employee.getNextId();
        System.out.println("Next available id: " + id);
    }
}
