package com.practice.core.twoPointerProblem;

import java.util.Arrays;

public class ColorSort {
    //Dutch National Flag Problem
    //Given an array with n objects colored red, white, or blue (represented by integers 0, 1, and 2), sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.


    public static void main(String[] args) {

        int[] array = {0, 1, 2, 1, 1, 1, 2, 0, 0, 0, 2, 2, 2};

        int low = 0;
        int high = array.length - 1;
        int current = 0;
        while (current <= high) {
            if (array[current] == 0) {
                swap(array, current, low);
                low++;
                current++;
            } else if (array[current] == 2) {
                swap(array, current, high);
                high--;
            } else {
                current++;
            }

        }
        Arrays.stream(array).forEach(System.out::println);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
