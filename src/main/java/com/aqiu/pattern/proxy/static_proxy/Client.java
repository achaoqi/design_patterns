package com.aqiu.pattern.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyPoint proxy=new ProxyPoint();
        proxy.sell();
    }
}
