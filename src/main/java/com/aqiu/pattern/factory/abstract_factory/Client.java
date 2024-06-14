package com.aqiu.pattern.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        AmericanDessertFactory americanFactory = new AmericanDessertFactory();
        System.out.println(americanFactory.createCoffee().getName());
        americanFactory.createDessert().show();

        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        System.out.println(italyDessertFactory.createCoffee().getName());
        italyDessertFactory.createDessert().show();
    }
}
