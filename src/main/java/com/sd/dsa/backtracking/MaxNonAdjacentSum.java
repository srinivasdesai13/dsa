package com.sd.dsa.backtracking;

public class MaxNonAdjacentSum {

	/*
	 * Problem: You are given an array of integers, and your task is to find the
	 * maximum sum of a subarray with the constraint that no two elements in the
	 * subarray are adjacent. In other words, you cannot pick adjacent elements from
	 * the original array.
	 * 
	 */

	public static void main(String[] args) {
		int[] nums = { 5, 20, 15, -2, 18 };
		int result = maxNonAdjacentSum(nums);
		System.out.println("Indices of the two numbers: " + result);
	}

	public static int maxNonAdjacentSum(int[] nums) {
		return dfs(nums, 0, 0);
	}

	public static int dfs(int[] nums, int index, int current_sum) {
		if (index >= nums.length) {
			return current_sum;
		}

		int inc = dfs(nums, index + 2, current_sum + nums[index]);
		int exc = dfs(nums, index + 1, current_sum);
		return Math.max(inc, exc);

	}
	
	
}
