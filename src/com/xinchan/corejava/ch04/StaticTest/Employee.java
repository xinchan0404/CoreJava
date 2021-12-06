package com.xinchan.corejava.ch04.StaticTest;

/**
 * @author zegxn
 * @version 1.0.1 2021-10-31
 */
public class Employee {
    private static int nextId = 1;

    // instance field
    private String name;
    private double salary;
    private int id;

    // constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        setId();
    }

    // methods
    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = Employee.nextId;
        Employee.nextId++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {  // unit test
        Employee e = new Employee("zhangsan", 1000);
        System.out.println(e);
    }
}
