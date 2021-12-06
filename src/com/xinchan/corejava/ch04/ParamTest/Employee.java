package com.xinchan.corejava.ch04.ParamTest;

/**
 * @author zegxn
 * @version 1.0.1 2021-10-31
 */
public class Employee {
    // instance field
    private String name;
    private double salary;

    // constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        this.salary += this.salary * byPercent / 100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
