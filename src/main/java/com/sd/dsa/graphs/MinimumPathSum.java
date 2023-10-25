package com.sd.dsa.graphs;

public class MinimumPathSum {
	/*
	 * Problem: Minimum Path Sum
	 * 
	 * Given a 2D grid filled with non-negative numbers, find a path from the
	 * top-left corner to the bottom-right corner that minimizes the sum of numbers
	 * along its path. You can only move down or to the right.
	 * 
	 * Write a Java function to find the minimum path sum.
	 * 
	 * Please implement this function and provide the code along with the expected
	 * input and output for verification.
	 * 
	 * grid = [  [1, 3, 1],
  [1, 5, 1],
  [4, 2, 1]
]

	 */
	public static void main(String args[]) {
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] dp = new int[grid.length][grid[0].length];
		dp[0][0] = grid[0][0];
		for (int r = 1; r < grid.length; r++) {
			dp[r][0] = dp[r - 1][0] + grid[r][0];
		}
		for (int c = 1; c < grid[0].length; c++) {
			dp[0][c] = dp[0][c - 1] + grid[0][c];
		}

		for (int r = 1; r < grid.length; r++) {
			for (int c = 1; c < grid[0].length; c++) {
				dp[r][c] = grid[r][c] + Math.min(dp[r - 1][c], dp[r][c - 1]);
			}
		}
		System.out.println(dp[grid.length - 1][grid[0].length - 1]);
	}
}