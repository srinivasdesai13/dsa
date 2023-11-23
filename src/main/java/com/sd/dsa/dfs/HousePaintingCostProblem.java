package com.sd.dsa.dfs;

public class HousePaintingCostProblem {
	/**
	 * 
	 * Question:
	 * 
	 * You are given an array of integers representing a row of houses. Each house
	 * can be painted with one of three colors: red, blue, or green. The cost of
	 * painting each house with a certain color is different. Write a Java method to
	 * find the minimum cost of painting all the houses, ensuring that no two
	 * adjacent houses have the same color.
	 * 
	 */

	public static void main(String[] args) {
		int[][] houseCosts = { { 17, 2, 1 }, 
								{ 4, 16, 16 }, 
								{ 14, 3, 19 } 
								};

		int result = dfs(houseCosts, 0, -1);
		System.out.println("Minimum cost of painting all houses: " + result);
	}

	private static int dfs(int[][] costs, int house, int prevColor) {
		if (house == costs.length) {
			return 0;
		}

		int minCost = Integer.MAX_VALUE;

		for (int color = 0; color < costs[0].length; color++) {
			if (color != prevColor) {
				int currentCost = costs[house][color] + dfs(costs, house + 1, color);
				minCost = Math.min(minCost, currentCost);
			}
		}

		return minCost;
	}

}
