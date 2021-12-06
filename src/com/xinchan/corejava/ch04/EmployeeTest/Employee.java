package com.xinchan.corejava.ch04.EmployeeTest;

import java.time.LocalDate;

/**
 * This program defines my first class Employee
 * @author zegxn
 * @version 1.0.1 2021-10-31
 */
public class Employee {
    // instance field
    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructor
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    // methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        this.salary += this.salary * byPercent / 100;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + ", hireDay=" + hireDay + '}';
    }
}
