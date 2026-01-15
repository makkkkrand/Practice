package com.practice.core.stringOpsProblem;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringLengthWithoutDuplicate {

    public static void main(String[] args) {

        String str = "abcdeffghij";
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> seenChars = new HashMap<>();
        for (int right = 0; right < str.length(); right++) {
            char currentChar = str.charAt(right);
            // If the char is seen and within the current window,
            // move left pointer past its last occurrence
            if (seenChars.containsKey(currentChar) && seenChars.get(currentChar) >= left) {
                left = seenChars.get(currentChar) + 1;
            }
            seenChars.put(currentChar, right); // Update the character's last seen index
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);

    }
}
