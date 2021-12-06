package com.xinchan.corejava.ch05.abstractClasses;

import java.time.LocalDate;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-02
 */
public class Employee extends Person{
    // instance field
    private double salary;
    private LocalDate hireDay;

    // constructor
    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    // methods
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
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + super.getName() +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
