package com.xinchan.collection.list;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-16
 */
public class Student {
    // instance field
    private String name;
    private int no;

    // constructor
    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", no=" + no + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return this.name.equals(student.getName()) && this.no == student.getNo();
    }
}
