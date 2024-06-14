package com.aqiu.pattern.factory.abstract_factory;

public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatterCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
