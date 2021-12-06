package com.xinchan.corejava.ch04.ConstructorTest;

import java.util.Random;

/**
 * @author zegxn
 * @version 1.0.1 2021-10-31
 */
public class Employee {
    private static int nextId;
    // instance field
    private int id;
    private String name = "";  // instance field initialization
    private double salary;

    // static initialization
    static {
        Random random = new Random();
        nextId = random.nextInt(1000);
    }

    // object initialization block
    {
        id = Employee.nextId;
        Employee.nextId++;
    }

    // three constructors overloading

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("Employee #" + Employee.nextId, salary);
    }

    // the default constructor
    public Employee() {
        // name initialized to ""--see above
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
    }

    // methods
    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
