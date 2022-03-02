package com.xinchan.corejava.ch09.map;

/**
 * @author xinchan
 * @version 1.0.1 2022-03-01
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
        this.salary = 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
