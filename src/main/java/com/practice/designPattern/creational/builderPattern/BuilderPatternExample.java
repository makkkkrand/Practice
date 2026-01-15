package com.practice.designPattern.creational.builderPattern;

public class BuilderPatternExample {

    public static void main(String[] args) {
        BuilderPattern pattern = new BuilderPattern.BuilderPatterBuilder("Mukund").canDisplayName(true).build();
        System.out.println(pattern.toString());
        System.out.println(new BuilderPattern.BuilderPatterBuilder("default value").build());
    }

}
