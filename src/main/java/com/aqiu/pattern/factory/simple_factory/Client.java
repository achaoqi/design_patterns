package com.aqiu.pattern.factory.simple_factory;

public class Client {
    public static void main(String[] args) {
        Coffee americancoffee = CoffeeStore.orderCoffee("americancoffee");
        System.out.println(americancoffee.getName());
    }
}
