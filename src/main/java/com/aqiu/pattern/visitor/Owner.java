package com.aqiu.pattern.visitor;

public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主任喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主任喂食猫");
    }
}
