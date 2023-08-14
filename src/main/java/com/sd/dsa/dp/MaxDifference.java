package com.sd.dsa.dp;

public class MaxDifference {
	
	/*
	 * Question: Implement a function that takes an array of integers as input and
	 * returns the maximum difference between any two elements in the array. The
	 * maximum difference should be calculated such that the larger element appears
	 * after the smaller element in the array.
	 * 
	 */
	public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        int maxDiff = maxDifference(nums);
        System.out.println("Maximum difference: " + maxDiff);
    }
    
     public static int maxDifference(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            max = Math.max(max, num);
            min = Math.min(min,num);
        }
        
        return max-min;
    }
}
