package com.practice.designPattern.behavioural.iteratorPattern;

interface Iterator<T> {
    boolean hasNext();
    T next();
}