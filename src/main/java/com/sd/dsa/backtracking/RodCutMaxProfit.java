package com.sd.dsa.backtracking;

public class RodCutMaxProfit {
	
	/*
	 * Question: You are given a list of positive integers representing the lengths
	 * of different rods, and their corresponding prices. You want to cut these rods
	 * into smaller pieces to maximize the total price. Each rod can be cut into
	 * multiple pieces, and the price you get for each piece is based on its length.
	 * Write a dynamic programming function to find the maximum price that can be
	 * obtained.
	 * 
	 * For example:
	 * 
	 * Rod lengths: [1, 2, 3, 4, 5, 6, 7, 8] Corresponding prices: [1, 5, 8, 9, 10,
	 * 17, 17, 20] Rod length to cut: 8 Output: 22 (by cutting the rod of length 8
	 * into two pieces of length 2 and 6)
	 * 
	 */
	public static void main(String args[]) {
		int[] rl = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] p = { 1, 5, 8, 9, 10, 17, 17, 20 };
		int len = 8;

		int response = dfs(rl, p, len, 0, 0);
		System.out.println("Response " + response);

	}

	public static int dfs(int[] rl, int[] p, int len, int index, int currentsum) {

		if (len < 0) {
			return 0;
		}

		if (index == rl.length) {
			return currentsum;
		}

		if (rl[index] > len) {
			return currentsum;
		}

		int inc = dfs(rl, p, len - rl[index], index + 1, currentsum + p[index]);
		int ex = dfs(rl, p, len, index + 1, currentsum);
		return Math.max(inc, ex);

	}

}
