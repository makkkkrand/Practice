package com.practice.core.stringOpsProblem;

public class StringCoreExamples {
    public static void main(String[] args) {
        {
            System.out.println("Core module is running.");
            String s1 = "Hello, World!";
            String s2 = new String("Hello, World!");

            System.out.println("s1 equals s2: " + s1.equals(s2));
            System.out.println("s1 == s2: " + (s1 == s2));

        }
    }
}
