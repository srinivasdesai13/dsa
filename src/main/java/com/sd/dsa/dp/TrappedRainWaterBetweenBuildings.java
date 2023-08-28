package com.sd.dsa.dp;

public class TrappedRainWaterBetweenBuildings {

	/**
	 * Question: You are given an array of integers representing a sequence of
	 * buildings' heights. Each building has a width of 1. It starts raining, and
	 * you want to know how much water will be trapped between the buildings. Write
	 * a function to calculate the total amount of water that can be trapped.
	 * 
	 * 
	 * Input: The input is an array height where height[i] represents the height of
	 * the building at position i.
	 * 
	 * Output: The function should return an integer representing the total amount
	 * of water that can be trapped between the buildings.
	 * 
	 * For example, in the input array {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, the
	 * total trapped water is 6 units. The water is trapped between buildings at
	 * positions 2 and 9 (inclusive). Therefore, the function should return 6.
	 */

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int trappedWater = trap(height);
		System.out.println("Total trapped water: " + trappedWater + " units");
	}

	public static int trap(int[] height) {
		int l = 0, r = height.length - 1;
		int max_area = 0;
		int min = 0;
		int left_max = Integer.MIN_VALUE;
		int right_max = Integer.MIN_VALUE;
		while (l < r) {

			left_max = Math.max(left_max, height[l]);
			right_max = Math.max(right_max, height[r]);

			if (left_max < right_max) {
				max_area += left_max - height[l];
				l++;
			} else {
				max_area += right_max - height[r];
				r--;
			}
		}
		return max_area;
	}
}
