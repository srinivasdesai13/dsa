package com.sd.dsa.mustdo.arrays;

public class PivotIndex {

	/**
	 * Question:
	 * 
	 * You are given an array nums consisting of integers. Write a Java method to
	 * find the "pivot" index of the array. The pivot index is the index where the
	 * sum of all elements to the left is equal to the sum of all elements to the
	 * right. If no such index exists, return -1.
	 * 
	 */
	public static int pivotIndex(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}

		int currentSum = 0;
		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			if (sum - currentSum == currentSum - nums[i]) {
				return i;
			}
		}
		return -1; // Replace this with the actual result
	}

	public static void main(String[] args) {
		// Example usage:
		int[] nums = { 1, 7, 3, 6, 5, 6};
		int result = pivotIndex(nums);
		System.out.println("Pivot Index: " + result);
	}
}
