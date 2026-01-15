package com.practice.core.stringOpsProblem;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Mukund";
        int left = 0;
        int right = str.length() -1;
        char[] charArray = str.toCharArray();

        while(left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(charArray));
    }

}
