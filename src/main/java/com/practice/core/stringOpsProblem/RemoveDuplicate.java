package com.practice.core.stringOpsProblem;

import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "Automation is the automated string";

        List<Character> firstOccuredChar = new ArrayList<>();
        StringBuffer buffer = new StringBuffer();
        StringBuffer duplicateBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(Character.compare(' ', str.charAt(i)) == 0){
                buffer.append(" ");
                duplicateBuffer.append(" ");
            } else if(!firstOccuredChar.contains(str.charAt(i))){
                buffer.append(str.charAt(i));
                firstOccuredChar.add(str.charAt(i));
            } else
                duplicateBuffer.append(str.charAt(i));
        }

        System.out.println(buffer.toString());
        System.out.println(duplicateBuffer.toString());

    }
}
