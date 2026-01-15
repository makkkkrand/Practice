package com.practice.core.stringOpsProblem;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {

        String s1 = "Mukund";
        String s2 = "dnukuMa";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] charCount = new int[26];
        int maxLength = Math.max(s1.length(), s2.length());
        try {
            for (int i = 0; i < maxLength; i++) {
                charCount[s1.charAt(i) - 'a']++;
                charCount[s2.charAt(i) - 'a']--;
            }
        } catch (Exception e) {
            System.out.println("not anagram");
            throw new RuntimeException(e);
        }
        for (int i = 0; i < charCount.length; i++) {
            if(charCount[i]!=0){
                System.out.println("not Anagram");
                return;
            }

        }
        System.out.println("Anagram");
    }
}
