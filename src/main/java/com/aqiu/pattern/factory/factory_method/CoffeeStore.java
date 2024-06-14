package com.aqiu.pattern.factory.factory_method;

public class CoffeeStore {
    private CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory){
        this.factory=factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
