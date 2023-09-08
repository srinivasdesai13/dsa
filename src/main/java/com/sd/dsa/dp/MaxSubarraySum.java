package com.sd.dsa.dp;

public class MaxSubarraySum {

	/*
	 * Question: You are given an array of integers, and you want to find the
	 * subarray with the maximum sum. Write a function to find the maximum sum of a
	 * subarray within the given array.
	 */
	public static int maxSubarraySum(int[] nums) {
		int max = Integer.MIN_VALUE;
		int cur = 0;
		for (int num : nums) {
			cur = Math.max(num, num + cur);
			max = Math.max(max, cur);

		}
		return max;
	}

	public static void main(String[] args) {
		int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Maximum Subarray Sum (nums1): " + maxSubarraySum(nums1)); // Output: 6

		int[] nums2 = { 1, 2, 3, 4, -2, 6, -8, 2 };
		System.out.println("Maximum Subarray Sum (nums2): " + maxSubarraySum(nums2)); // Output: 12
	}
}
