package com.sd.dsa.dp;

public class MaxNonAdjacentSum {

	/**
	 * Problem: You are given an array nums containing positive integers. Write a
	 * Java method to find the maximum sum of a non-empty subarray with the
	 * constraint that you are not allowed to select adjacent elements. For example,
	 * given the array [1, 2, 3, 4, 5], the maximum sum is 9, which is obtained by
	 * selecting elements [1, 3, 5].
	 * 
	 * int[] nums1 = {1, 2, 3, 4, 5};
System.out.println(MaxNonAdjacentSum.maxNonAdjacentSum(nums1)); // Output: 9


int[] nums2 = {3, 2, 7, 10};
System.out.println(MaxNonAdjacentSum.maxNonAdjacentSum(nums2)); // Output: 13


int[] nums3 = {5, 1, 1, 5};
System.out.println(MaxNonAdjacentSum.maxNonAdjacentSum(nums3)); // Output: 10

	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int[] nums2 = {3, 2, 7, 10};
		System.out.println(dp(nums2)); // Output: 13

	}

	public static int maxNonAdjacentSum(int[] nums) {
		// Your code here
		// Replace this with the actual result
		// Use dynamic programming to solve the problem
		return dfs(nums, 0); // Placeholder, replace with actual result
	}

	public static int dfs(int[] nums, int i) {

		if (i >= nums.length) {
			return 0;
		}

		int inc = 0;
		inc = nums[i] + dfs(nums, i + 2);
		int exc = dfs(nums, i + 1);

		return Math.max(inc, exc);

	}
	
	public static int dp(int[] nums) {
		
		
		int[] dp = new int[nums.length];
		
		dp[0] = nums[0];
		dp[1] = Math.max(dp[0],nums[1]);
		
		for(int i=2;i<nums.length;i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
		
		return dp[nums.length-1];
	}

}
