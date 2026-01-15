package com.practice.core.twoPointerProblem;

import com.practice.utils.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pair {

    //Given an array of integers and a target difference k, find the number of pairs that have exactly that difference (|a - b| = k).
    public static void main(String[] args) {
        System.out.println(getPair(4));
    }

    private static Object getPair(int diff) {

        int[] integerArray = Constants.INTEGER_ARRAY;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(integerArray);
            int left = 0;
            int right = 1;
            while(right<integerArray.length){
                int compare = Integer.compare(diff, Math.abs(integerArray[left] - integerArray[right]));
                if(compare == 0 ){
                    result.add(Arrays.asList(integerArray[left], integerArray[right]));
                    left++;
                    right++;
                } else if (compare==-1) {
                    left++;
                } else {
                    right++;
                }

            }

        return result.size();
    }

}
