package com.aqiu.pattern.adapter.object_adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.readSd(new SDCardImpl()));
        System.out.println(computer.readSd(new SDAdapterTF(new TFCardImpl())));
    }
}
