package com.aqiu.pattern.factory.factory_method;

public class LatterCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatterCoffee();
    }
}
