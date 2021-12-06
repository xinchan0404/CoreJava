package com.xinchan.corejava.ch04.ConstructorTest;

/**
 * @author zegxn
 * @version 1.0.1 2021-10-31
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staffs = new Employee[3];

        int initId = Employee.getNextId();
        System.out.println("Next available id: " + initId);


        staffs[0] = new Employee("zhangsan", 1000);
        staffs[1] = new Employee(2000);
        staffs[2] = new Employee();

        for (Employee staff : staffs) {
            System.out.println(staff);
        }

        int nextId = Employee.getNextId();
        System.out.println("Next available id: " + nextId);
    }
}
