package com.aqiu.pattern.iterator;

public class Student {
    private String number;
    private String name;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Student(String number, String name) {
        this.number = number;
        this.name = name;
    }
}
