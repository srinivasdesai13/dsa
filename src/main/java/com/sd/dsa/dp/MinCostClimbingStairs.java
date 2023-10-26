package com.sd.dsa.dp;

public class MinCostClimbingStairs {

	/**
	 * Problem: You are given an array of positive integers, where each integer
	 * represents the cost to step on it. You start at the first integer in the
	 * array and want to reach the last integer while minimizing the total cost. You
	 * can move to the next integer either by taking one step or two steps. Find the
	 * minimum cost to reach the last integer.
	 * 
	 * Input:
	 * 
	 * An array of positive integers representing the cost to step on each integer.
	 * Output:
	 * 
	 * An integer representing the minimum cost to reach the last integer.
	 * 
	 * 
	 * Input 1: Costs = [10, 15, 20] Output 1: Minimum cost to reach the last
	 * integer: 15
	 * 
	 * Input 2: Costs = [1, 100, 1, 1, 1, 100, 1, 1, 100] Output 2: Minimum cost to
	 * reach the last integer: 6
	 * 
	 * Input 3: Costs = [5, 5, 10, 10, 15, 15, 20] Output 3: Minimum cost to reach
	 * the last integer: 30
	 * 
	 * 
	 */

	public static void main(String args[]) {
		int[] arr = { 5, 5, 10, 10, 15, 15, 20 };

		System.out.println("Sum of x+y = " + minCostClimbingStairs(arr));
	}

	public static int minCostClimbingStairs(int[] costs) {
		int n = costs.length;
		if (n <= 1) {
			return 0; // No cost to reach the first or second step
		}

		int[] dp = new int[n];
		dp[0] = costs[0];
		dp[1] = costs[1];

		for (int i = 2; i < n; i++) {
			dp[i] = costs[i] + Math.min(dp[i - 1], dp[i - 2]);
		}

		// The minimum cost to reach the last step is the minimum of the last two values
		// in dp array
		return Math.min(dp[n - 1], dp[n - 2]);
	}

}