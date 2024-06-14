package com.aqiu.pattern.adapter.object_adapter;

public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard=tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
