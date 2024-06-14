package com.aqiu.pattern.factory.simple_factory;

public class CoffeeStore {
    static SimpleCoffeeFactory factory=new SimpleCoffeeFactory();

    public static Coffee orderCoffee(String type){
        Coffee coffee = factory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
