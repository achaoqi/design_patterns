package com.aqiu.pattern.iterator;

public interface StudentAggregate {
    void addStudent(Student student);
    void removeStudent(Student student);
    StudentIterator getStudentIterator();
}
