package com.sd.dsa.dp;

public class LengthOfLongestIncreasingSubarray {
	
	/*
	 * Implement a function that takes an array of integers as input and returns the
	 * length of the longest increasing subarray. An increasing subarray is a
	 * contiguous subarray where the elements are in strictly increasing order.
	 * 
	 */ public static int findLengthOfLongestIncreasingSubarray(int[] nums) {
	       
	       int max = Integer.MIN_VALUE;
	       int current = 0;
	       for(int i=1;i<nums.length;i++){
	           
	           if(nums[i]<nums[i-1]){
	               max = Math.max(max, current);
	               current = 0;
	           }
	           current++;
	           
	       }
	       
	       max = Math.max(max, current);
	       
	       return max;
	       
	       
	    }

	    public static void main(String[] args) {
	        int[] nums = { 1, 3, 5, 2, 6, 8, 9, 10 };
	        int maxLength = findLengthOfLongestIncreasingSubarray(nums);
	        System.out.println("Length of longest increasing subarray: " + maxLength);
	    }

}
