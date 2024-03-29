package com.sd.dsa.graphs;

public class UniquePaths {

	/*
	 * Problem: Unique Paths
	 * 
	 * A robot is located at the top-left corner of a grid (m x n). The robot can
	 * only move either down or right at any point in time. The robot is trying to
	 * reach the bottom-right corner of the grid. How many possible unique paths are
	 * there?
	 * 
	 * Write a Java method that solves this problem. Provide the method definition,
	 * input parameters, and expected output.
	 * 
	 */ public static void main(String args[]) {

		System.out.println("Sum of x+y = " + uniquePaths(3, 7));
	}

	public static int uniquePaths(int m, int n) {

		int[][] dp = new int[m][n];

		for (int i = 0; i < m; i++) {
			dp[i][0] = 1;
		}

		for (int i = 0; i < n; i++) {
			dp[0][i] = 1;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];

			}

		}
		return dp[m - 1][n - 1];
	}

}
