package com.practice.designPattern.behavioural.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteRegister implements Publish, Register {

    private List<Observer> observerList = new ArrayList<>();
    private String data;

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver(String data) {
        for(Observer o: observerList){
            o.update(data);
        }
    }

    @Override
    public void publishData(String data) {
        this.data = data;
        notifyObserver(data);
    }
}
