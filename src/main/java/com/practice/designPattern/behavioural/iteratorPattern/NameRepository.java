package com.practice.designPattern.behavioural.iteratorPattern;

class NameRepository implements Container<String> {

    private String[] names = {"John", "Jane", "Mike"};

    @Override
    public Iterator<String> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return names[index++];
        }
    }
}