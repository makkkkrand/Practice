package com.practice.designPattern.behavioural.iteratorPattern;

interface Container<T> {
    Iterator<T> getIterator();
}