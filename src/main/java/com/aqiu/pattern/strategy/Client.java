package com.aqiu.pattern.strategy;

public class Client {
    public static void main(String[] args) {
        new SalesMan(new StrategyA()).show();
        new SalesMan(new StrategyB()).show();
        new SalesMan(new StrategyC()).show();
    }
}
