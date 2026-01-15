package com.practice.core.twoPointerProblem;

import com.practice.utils.Constants;

import java.util.*;

public class ThreeSum {

    //Find all unique triplets in an array whose sum is Value(here say 0) (a + b + c = 0).

    public static void main(String[] args) {
        System.out.println("3 sum problem:" + get3SumSolution(14));
    }

    private static List<List<Integer>> get3SumSolution(int sum) {
        List<List<Integer>> resultList = new ArrayList<>();

        int[] array = Constants.INTEGER_ARRAY;

        for (int i = 0; i < array.length - 2; i++) {
            int referenceSum = sum - array[i];
            int leftPointer = i + 1;
            int rightPointer = array.length - 1;

            while (leftPointer < rightPointer) {
                int remainingSum = array[leftPointer] + array[rightPointer];
                if (referenceSum == remainingSum) {
                    List<Integer> combination = Arrays.asList(array[i], array[leftPointer], array[rightPointer]);
                    Collections.sort(combination);
                    if (!resultList.contains(combination)) {
                        resultList.add(combination);
                    }
                    leftPointer++;
                    rightPointer--;
                    while (leftPointer < rightPointer && array[leftPointer] == array[leftPointer - 1]) leftPointer++;
                    while (leftPointer < rightPointer && array[rightPointer] == array[rightPointer + 1]) rightPointer--;
                } else if (remainingSum < referenceSum) {
                    leftPointer++;
                } else {
                    rightPointer--;
                }
            }
        }
        return resultList;
    }

}
