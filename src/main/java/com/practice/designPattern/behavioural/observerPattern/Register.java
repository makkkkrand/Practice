package com.practice.designPattern.behavioural.observerPattern;

public interface Register {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(String data);

}
