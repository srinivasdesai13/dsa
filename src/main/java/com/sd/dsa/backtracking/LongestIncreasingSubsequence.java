package com.sd.dsa.backtracking;

import java.util.HashMap;
import java.util.Map;

public class LongestIncreasingSubsequence {

	/*
	 * Problem: You are given an array nums of positive integers. Your task is to
	 * find the length of the longest increasing subsequence (LIS) from the given
	 * array.
	 * 
	 * Input:
	 * 
	 * An array of positive integers, int[] nums, where 1 <= nums.length <= 2500 and
	 * 1 <= nums[i] <= 10^4. Output:
	 * 
	 * An integer representing the length of the longest increasing subsequence.
	 * 
	 */
	public static void main(String args[]) {
		int x = 10;
		int y = 25;
		int z = x + y;
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };

		System.out.println("Sum of x+y = " + lengthOfLIS(nums));

	}

	public static int lengthOfLIS(int[] nums) {
		Map<String, Integer> map = new HashMap<>();
		int response1 = dfs(nums, 0, Integer.MIN_VALUE, map);
		return response1;
	}

	public static int dfs(int[] nums, int index, int prev, Map<String, Integer> map) {

		if (index == nums.length) {
			return 0;
		}

		if (map.get(index + "-" + prev) != null) {
			return map.get(index + "-" + prev);
		}

		int inc = 0;
		if (nums[index] > prev) {
			inc = 1 + dfs(nums, index + 1, nums[index], map);
		}

		int exc = dfs(nums, index + 1, prev, map);

		int resp = Math.max(inc, exc);

		map.put(index + "-" + prev, resp);
		return map.get(index + "-" + prev);

	}

}