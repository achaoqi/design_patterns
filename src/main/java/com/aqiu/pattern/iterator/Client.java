package com.aqiu.pattern.iterator;

public class Client {
    public static void main(String[] args) {
        StudentAggregate studentAggregate=new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三","10086"));
        studentAggregate.addStudent(new Student("李四","10087"));
        studentAggregate.addStudent(new Student("赵六","10088"));
        StudentIterator iterator = studentAggregate.getStudentIterator();
        while(iterator.hasNext()){
            Student next = iterator.next();
            System.out.printf("%s %s\n",next.getName(),next.getNumber());
        }
    }
}
