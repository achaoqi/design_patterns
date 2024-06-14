package com.aqiu.pattern.flyweight;

public class Client {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        factory.get("i").display("yellow");
        factory.get("l").display("red");
        factory.get("o").display("blue");
    }
}
