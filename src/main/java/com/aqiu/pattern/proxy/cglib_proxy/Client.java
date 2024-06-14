package com.aqiu.pattern.proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject);
    }
}
