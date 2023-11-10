package com.sd.dsa.mustdo.arrays;

import java.util.*;

public class FirstMissingPositive {

	/**
	 * Problem: First Missing Positive
	 * 
	 * Given an unsorted integer array, find the smallest missing positive integer.
	 * 
	 * Write a function to find the first missing positive integer in the array.
	 * 
	 * For example:
	 * 
	 * Input: [3, 4, -1, 1] Output: 2 Input: [1, 2, 0] Output: 3 Input: [7, 8, 9,
	 * 11, 12] Output: 1
	 * 
	 */

	public static void main(String args[]) {

		int[] nums = { 7, 8, 9, 11, 12 };
		int n = nums.length;
		// Find the smallest missing positive integer
		int smallestMissing = 1;
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		while (smallestMissing <= n && set.contains(smallestMissing)) {
			smallestMissing++;
		}

		System.out.println("Smallest missing positive integer: " + smallestMissing);

	}
}