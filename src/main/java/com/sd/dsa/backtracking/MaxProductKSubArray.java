package com.sd.dsa.backtracking;

import java.util.*;

public class MaxProductKSubArray {
	/*
	 * Question: You are given an array of integers. Your task is to implement a
	 * Java method that finds and returns the maximum product of any two integers
	 * from the array.
	 */

	private static int iteration = 0;

	public static void main(String args[]) {
		int[] nums = { 11, 7, 2, 12,3, 4, 5, 6, 10 };
		System.out.println("Sum of x+y = " + maxProduct(nums));
	}

	public static int maxProduct(int[] nums) {
		Map<String, Integer> map = new HashMap<>();
		int[] max = { Integer.MIN_VALUE };
		dfs(nums, 0, 0, 1, max, map);
		return max[0];
	}

	public static void dfs(int[] nums, int index, int used, int current, int[] max, Map<String, Integer> map) {
		System.out.println(++iteration);

		if (used == 2) { // 2 can be replaced by k
			max[0] = Math.max(max[0], current);

			return;
		}

		if (index >= nums.length) {
			return;
		}

		dfs(nums, index + 1, used + 1, current * nums[index], max, map);
		dfs(nums, index + 1, used, current, max, map);

	}

}
