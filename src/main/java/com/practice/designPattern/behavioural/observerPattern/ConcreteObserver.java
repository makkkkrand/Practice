package com.practice.designPattern.behavioural.observerPattern;

public class ConcreteObserver implements Observer {
    private String logerName;

    public ConcreteObserver(String logerName) {
        this.logerName = logerName;
    }

    @Override
    public void update(String data) {
        System.out.println(data + "publish to "+ logerName);
    }
}
