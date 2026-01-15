package com.practice.designPattern.creational.singletonPattern;

public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if(null==instance){
            instance= new SingletonClass();
        }
        return instance;
    }

}
