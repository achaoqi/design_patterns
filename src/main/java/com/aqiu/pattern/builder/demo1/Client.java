package com.aqiu.pattern.builder.demo1;

public class Client {
    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.buildBike();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}