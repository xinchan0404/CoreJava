package com.xinchan.corejava.ch03.test;

/**
 * @author zegxn
 * @version 1.0.1 2021-10-26
 */
public class test1026 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(Employee.getNextId());
    }
}


class Employee {
    private int id;
    private static int nextId = 1;

    public Employee() {
        this.id = Employee.nextId;
        Employee.nextId++;
    }

    public static int getNextId() {
        return Employee.nextId;
    }

    /*需要使用对象调用静态字段，不推荐使用
    public int getNextId() {
        return Employee.nextId;
    }*/

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + '}';
    }
}