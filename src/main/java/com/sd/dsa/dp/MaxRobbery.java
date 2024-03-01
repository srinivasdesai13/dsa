package com.sd.dsa.dp;

public class MaxRobbery {

	/*
	 * Question: You are given an array nums representing the values of houses along
	 * a street. Each house has a certain amount of money stashed. The goal is to
	 * determine the maximum amount of money you can rob tonight without alerting
	 * the police. The only constraint is that you cannot rob adjacent houses.
	 * 
	 * Write a Java method named maxRobbery that takes an array of integers nums as
	 * input and returns the maximum amount of money that can be robbed.
	 * 
	 * Please provide the method definition, including inputs and outputs, and
	 * implement the solution using dynamic programming.
	 * 
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };
		int result = MaxRobbery.maxRobbery(nums);
		System.out.println(result);

	}

	/**
	 * Determines the maximum amount of money that can be robbed from houses without
	 * alerting the police.
	 *
	 * @param nums An array of integers representing the values of houses along a
	 *             street.
	 * @return The maximum amount of money that can be robbed.
	 */
	public static int maxRobbery(int[] nums) {
		int[] dp = new int[nums.length];

		dp[0] = nums[0];
		dp[1] = Math.max(dp[0], nums[1]);

		for (int i = 2; i < nums.length; i++) {

			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
		}

		return dp[nums.length - 1];
	}
	
	
	 	public static int dfs(int[] nums, int i){
	        if(i>=nums.length){
	            return 0;
	        }
	        
	        int inc = nums[i]+dfs(nums,i+2);
	        int exc = dfs(nums,i+1);
	        
	        return Math.max(inc,exc);
	        
	    }
}
