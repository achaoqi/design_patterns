package com.aqiu.pattern.iterator;

import java.util.List;

public class StudentIteratorImpl implements StudentIterator{
    private List<Student> list;
    private int position;

    public StudentIteratorImpl(List<Student> list){
        this.list=list;
        position=0;
    }

    @Override
    public boolean hasNext() {
        return position<list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
}
