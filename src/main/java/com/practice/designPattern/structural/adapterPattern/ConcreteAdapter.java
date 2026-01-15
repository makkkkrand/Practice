package com.practice.designPattern.structural.adapterPattern;

public class ConcreteAdapter implements OldInterface {

    private OldAdapImpl oldAdap;

    public ConcreteAdapter(OldAdapImpl oldAdap) {
        this.oldAdap = oldAdap;
    }

    @Override
    public double verb() {
        return oldAdap.getResult() * 0.5;
    }

}
