package com.aqiu.pattern.proxy.jdk_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private TrainStation trainStation=new TrainStation();

    public SellTickets getProxyObject(){
        SellTickets proxy = (SellTickets)Proxy.newProxyInstance(trainStation.getClass().getClassLoader(), trainStation.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("sell")){
                    System.out.println("代理点收取费用");
                }
                Object result = method.invoke(trainStation, args);
                return result;
            }
        });
        return proxy;
    }
}
