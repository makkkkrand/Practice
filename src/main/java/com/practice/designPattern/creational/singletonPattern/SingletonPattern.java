package com.practice.designPattern.creational.singletonPattern;

public class SingletonPattern {


    public static void main(String[] args) {
        SingletonClass pattern = SingletonClass.getInstance();
        System.out.println(pattern.hashCode());

        SingletonClass pattern1 = SingletonClass.getInstance();
        System.out.println(pattern1.hashCode());

    }


}
