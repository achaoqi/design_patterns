package com.aqiu.pattern.adapter.object_adapter;

public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "从sd卡读取";
    }

    @Override
    public void writeSD(String msg) {

    }
}
