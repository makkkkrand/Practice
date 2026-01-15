package com.practice.core;

import java.util.ArrayList;
import java.util.List;

public class ImmutableExample {
    //private final
    private final String name;
    private final List<String> address ;

    //    intialize using contructor
    public ImmutableExample(String name, List<String> address) {
        this.name = name;
        this.address = new ArrayList<>(address);
    }
    //only getters no setters
    public String getName() {
        return name;
    }

    // return copy of collection
    public List<String> getAddress() {
        return new ArrayList<>(this.address);
    }

}
