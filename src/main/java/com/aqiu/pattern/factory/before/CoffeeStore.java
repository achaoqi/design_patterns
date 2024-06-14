package com.aqiu.pattern.factory.before;

public class CoffeeStore {
    public static Coffee orderCoffee(String coffeeType){
        Coffee coffee=null;
        if("AmericanCoffee".equalsIgnoreCase(coffeeType)){
            coffee=new AmericanCoffee();
        }else if("LatterCoffee".equalsIgnoreCase(coffeeType)){
            coffee=new LatterCoffee();
        }
        if(coffee==null) return null;
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
