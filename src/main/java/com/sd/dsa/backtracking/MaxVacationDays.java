package com.sd.dsa.backtracking;

public class MaxVacationDays {

	/**
	 * Problem: You are given an array nums representing a flight's availability
	 * status for each day (0 means no flight, 1 means a flight is available). You
	 * want to book a flight for exactly k days (1 <= k <= length of nums) but with
	 * the condition that you can't book flights on consecutive days. What is the
	 * maximum number of days you can book a flight?
	 * 
	 * Write a method to solve this problem:
	 * 
	 * Input:
	 * 
	 * An array of integers, int[] nums, where nums.length >= 1. An integer k
	 * representing the number of days you want to book a flight. Output:
	 * 
	 * An integer representing the maximum number of days you can book a flight.
	 * 
	 * 
	 * 
	 */

	public static void main(String args[]) {
		int[] nums = { 1, 1, 0, 0, 1, 0, 1, 1 };
		int k = 2;

		System.out.println("Sum of x+y = " + maxVacationDays(nums, k));
	}

	public static int maxVacationDays(int[] nums, int k) {

		return dfs(nums, 0, k);
	}

	public static int dfs(int[] nums, int index, int k) {
		if (index >= nums.length) {
			return 0;
		}
		if (k == 0) {
			System.out.println("here ");
			return 0;
		}
		int inc = 0;
		if (nums[index] == 1) {
			inc = 1 + dfs(nums, index + 2, k - 1);
		}

		int ex = dfs(nums, index + 1, k);

		return Math.max(inc, ex);

	}
}