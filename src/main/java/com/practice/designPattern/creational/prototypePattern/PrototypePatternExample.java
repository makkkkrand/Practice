package com.practice.designPattern.creational.prototypePattern;

public class PrototypePatternExample {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype("proto1");
        System.out.println(concretePrototype);

        ConcretePrototype concretePrototype1 = (ConcretePrototype) concretePrototype.getClone();
        concretePrototype1.setName("proto2");
        System.out.println(concretePrototype1);

        ConcretePrototype concretePrototype2 = (ConcretePrototype) concretePrototype.getClone();
        concretePrototype2.setName("proto3");
        System.out.println(concretePrototype2);

    }
}
