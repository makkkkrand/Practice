package com.practice.designPattern.behavioural.iteratorPattern;

public class IteratorDemo {
    public static void main(String[] args) {

        NameRepository repository = new NameRepository();
        Iterator<String> iterator = repository.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}