package com.aqiu.pattern.prototype.test;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {

//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void show(){
        System.out.println(student.getName()+"三号学生");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        Citation clone = (Citation) super.clone();
        return clone;
    }
}
