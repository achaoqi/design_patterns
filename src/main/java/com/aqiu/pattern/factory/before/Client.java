package com.aqiu.pattern.factory.before;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeStore.orderCoffee("americanCoffee");
        assert coffee != null;
        System.out.println(coffee.getName());
    }
}
