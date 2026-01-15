package com.practice.core.twoPointerProblem;

import com.practice.utils.Constants;

public class MaxWaterInContainer {

    //Container With Most Water (LeetCode 11)
    //Given an array of vertical line heights, find two lines that, along with the x-axis, form a container that contains the most water



    public static void main(String[] args) {
        int[] height = Constants.INTEGER_ARRAY;
        System.out.println(getMaxArea(height));
    }

    public static int getMaxArea(int[] height ) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right){
//            displayStats(height, left, right);
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            System.out.println("currentArea:"+currentArea);
            maxArea = Math.max(maxArea, currentArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--; // Move right if height[right] is shorter or equal
            }
        }

        return maxArea;
    }

//    private static void displayStats(int[] height, int left, int right) {
//        System.out.println(left +", left height:"+ height[left]);
//        System.out.println(right +", right height:"+ height[right]);
//        System.out.println("height:"+Math.min(height[left], height[right]) );
//        System.out.println("base:"+(right - left));
//    }


}
