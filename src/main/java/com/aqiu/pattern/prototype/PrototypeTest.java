package com.aqiu.pattern.prototype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype t1=new Realizetype();
        Realizetype clone = t1.clone();
        System.out.println(t1==clone);
    }
}
