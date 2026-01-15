package com.practice.random;

public class FirstIndexOfSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] subArr =  {7,8,9};

        for(int i =0; i<arr.length-2; i++){
            int firstIndex = i;
            int a = arr[firstIndex];
            int b = arr[firstIndex+1];
            int c = arr[firstIndex+2];

            if(a==subArr[0]){
                if(b == subArr[1]){
                    if(c==subArr[2]){
                        System.out.println(i);
                        return;
                    }
                }
            } else{
                if(c<arr.length){
                    if(a==b) { i++;} else if(b==c){i= i+2;} else {continue;}

                }
            }
        }
        System.out.println("Not Found");
    }
}
