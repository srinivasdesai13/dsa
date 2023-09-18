package com.sd.dsa.dp;
public class MaxSubarrayProduct {
	
	/**
	 * 
	 * Problem: You are given an array nums of integers. Your task is to find the
	 * maximum product of any non-empty subarray of nums.
	 * 
	 * Input:
	 * 
	 * An array of integers, int[] nums, where 1 <= nums.length <= 2 * 10^4 and
	 * -10^9 <= nums[i] <= 10^9. Output:
	 * 
	 * An integer representing the maximum product of any non-empty subarray.
	 * 
	 */
	
    public static void main(String args[]) {
      int[] nums = {2, 3, -2, 4};

      System.out.println("Sum of x+y = " + maxProduct(nums));
    }
    
    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current = 1;
        for(int num:nums){
            current*=num;
            max = Math.max(max,current);
        }
        return max;
    }

}