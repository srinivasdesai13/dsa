package com.sd.dsa.dp;

public class MaxTrapperWater {

	/*
	 * Problem: You are given a list of non-negative integers representing the
	 * heights of walls at different positions. You are also given two pointers,
	 * left and right, initially pointing to the leftmost and rightmost positions,
	 * respectively. You can move either pointer one step at a time. Calculate the
	 * maximum amount of water that can be trapped between the two pointers by using
	 * the walls as containers.
	 */

	public static void main(String args[]) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int left = 0;
		int right = 11;

		int response = maxTrappedWater(height, left, right);
		System.out.println("Response " + response);
	}

	public static int maxTrappedWater(int[] height, int left, int right) {
		int max_area = Integer.MIN_VALUE;
		while (left < right) {

			int min = Math.min(height[left], height[right]);
			int len = right - left;
			max_area = Math.max(max_area, min * len);
			if (height[left] <= height[right]) {
				left++;
			} else {
				right--;
			}

		}

		return max_area;
	}

}
