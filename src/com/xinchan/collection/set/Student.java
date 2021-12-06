package com.xinchan.collection.set;

import java.util.Objects;

/**
 * @author xinchan
 * @version 1.0.1 2021-11-22
 */
public class Student implements Comparable<Student> {
    // instance field
    private String name;
    private int age;

    // constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return this.age == student.age && this.name.equals(student.name);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName()) == 0? this.age - o.getAge() : this.name.compareTo(o.getName());
    }
}
