package com.aqiu.pattern.singleton.demo1;

public class Singleton {
    private static final Singleton instance = new Singleton();

    static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
        System.out.println("Singleton instance created.");
    }
}
