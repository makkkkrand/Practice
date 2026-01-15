package com.practice.designPattern.behavioural.observerPattern;

public class ObserverPatternExample {
    public static void main(String[] args) {

        ConcreteRegister register = new ConcreteRegister();

        ConcreteObserver concreteObserver = new ConcreteObserver("Zuul logger");
        ConcreteObserver concreteObserver1 = new ConcreteObserver("slf4j logger");
        ConcreteObserver concreteObserver2 = new ConcreteObserver("pysy logger");

        register.addObserver(concreteObserver);
        register.addObserver(concreteObserver1);

        register.publishData("Entered Stream");
        register.publishData("Processing Stream");
        register.publishData("Ended Stream");

        register.removeObserver(concreteObserver1);
        register.addObserver(concreteObserver2);

        register.publishData("Entered Stream");
        register.publishData("Processing Stream");
        register.publishData("Ended Stream");

        register.removeObserver(concreteObserver);

        register.publishData("Entered Stream");
        register.publishData("Processing Stream");
        register.publishData("Ended Stream");

        register.removeObserver(concreteObserver2);

    }
}
