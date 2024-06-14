package com.aqiu.pattern.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxy = factory.getProxyObject();
        proxy.sell();
        System.out.println(proxy);
    }
}
