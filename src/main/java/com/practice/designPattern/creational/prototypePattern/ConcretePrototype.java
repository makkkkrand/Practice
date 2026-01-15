package com.practice.designPattern.creational.prototypePattern;

public class ConcretePrototype implements PrototypeInterface {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public PrototypeInterface getClone() {
        try {
            return (PrototypeInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                '}';
    }
}
