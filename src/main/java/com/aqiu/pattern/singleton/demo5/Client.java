package com.aqiu.pattern.singleton.demo5;

public class Client {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton1==singleton);
    }
}
