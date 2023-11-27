package com.sd.dsa.dfs;

public class HouseRobbing {

	/**
	 * Question:
	 * 
	 * You are given an array of non-negative integers representing a row of houses.
	 * Each house has a certain amount of money stashed. Write a Java method to
	 * determine the maximum amount of money you can rob tonight without alerting
	 * the police. The catch is that adjacent houses have a security system
	 * connected, and if two adjacent houses are robbed, the police will be alerted.
	 * You can assume that all houses have been arranged in a circle.
	 * 
	 */

	// Your task: Implement this method
	public static int rob(int[] nums) {
		int[] response = { Integer.MIN_VALUE };
		dfs(nums, 0, 0, response);
		return response[0]; // Replace this with the actual result
	}

	private static void dfs(int[] nums, int index, int currentSum, int[] response) {
		if (index >= nums.length) {
			response[0] = Math.max(response[0], currentSum);
			return;
		}

		dfs(nums, index + 2, currentSum + nums[index], response);

		dfs(nums, index + 1, currentSum, response);

	}

	public static void main(String[] args) {
		// Example usage:
		int[] houses = { 2, 7, 9, 3, 1 };
		int result = rob(houses);
		System.out.println("Maximum amount of money that can be robbed: " + result);
	}
}
