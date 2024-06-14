package com.aqiu.pattern.adapter.class_adapter;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "从tf卡读取";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card "+msg);
    }
}
