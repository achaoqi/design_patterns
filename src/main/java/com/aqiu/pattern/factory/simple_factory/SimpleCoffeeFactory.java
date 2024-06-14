package com.aqiu.pattern.factory.simple_factory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String coffeeType){
        Coffee coffee=null;
        if("AmericanCoffee".equalsIgnoreCase(coffeeType)){
            coffee=new AmericanCoffee();
        }else if("LatterCoffee".equalsIgnoreCase(coffeeType)){
            coffee=new LatterCoffee();
        }
        return coffee;
    }
}
