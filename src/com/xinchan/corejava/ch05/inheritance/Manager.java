package com.xinchan.corejava.ch05.inheritance;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-02
 */
public class Manager extends Employee{
    // instance field
    private double bonus;

    // constructor
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    // methods
    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Manager{" + "name='" + super.getName() + "', salary=" + super.getSalary() +
                ", hireDay=" + super.getHireDay() + ", bonus=" + this.bonus + '}';
    }
}
