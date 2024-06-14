package com.aqiu.pattern.bridge;

public class Client {
    public static void main(String[] args) {
        AviFile aviFile = new AviFile();
        RmvbFile rmvbFile = new RmvbFile();
        new Windows(aviFile).play("boduoyejieyi.avi");
        new Windows(rmvbFile).play("boduoyejieyi.rmvb");
    }
}
