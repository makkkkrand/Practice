package com.practice.designPattern.structural.adapterPattern;

public class AdapterPatternExample {

    //provided interface and a concrete class, adapter pattern help to integrate them with application

    public static void main(String[] args) {

        OldAdapImpl oldAdap = new OldAdapImpl();
        OldInterface concreteAdapter = new ConcreteAdapter(oldAdap);
        System.out.println( concreteAdapter.verb() );

    }

}
