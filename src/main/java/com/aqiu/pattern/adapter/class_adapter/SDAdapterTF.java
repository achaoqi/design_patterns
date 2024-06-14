package com.aqiu.pattern.adapter.class_adapter;

public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        writeTF(msg);
    }
}
