package com.aqiu.pattern.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store=new CoffeeStore(new AmericanCoffeeFactory());
        System.out.println(store.orderCoffee());
    }
}
