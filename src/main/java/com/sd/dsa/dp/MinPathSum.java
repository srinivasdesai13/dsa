package com.sd.dsa.dp;

import java.util.*;

public class MinPathSum {

	/*
	 * Problem: You are given a grid filled with non-negative numbers. You can only
	 * move right or down in the grid. Your task is to find a path from the top-left
	 * corner to the bottom-right corner that minimizes the sum of numbers along the
	 * path.
	 * 
	 * Input:
	 * 
	 * A 2D grid of non-negative integers, e.g., int[][] grid. Output:
	 * 
	 * An integer representing the minimum sum of numbers along the path from the
	 * top-left corner to the bottom-right corner.
	 * 
	 * 
	 */

	public static void main(String args[]) {

		int[][] grid = { //
				{ 5, 7, 1, 4 }, //
				{ 1, 8, 2, 6 }, //
				{ 3, 9, 5, 8 } //
		};
		System.out.println("Sum of x+y = " + minPathSum(grid));
	}

	public static int minPathSum(int[][] grid) {

		return dfs(grid, 0, 0);
	}

	public static int dfs(int[][] grid, int row, int col) {

		if (row == grid.length || col == grid[0].length) {
			return Integer.MAX_VALUE;
		}

		int moveright = dfs(grid, row, col + 1);
		int movedown = dfs(grid, row + 1, col);
		if (moveright == Integer.MAX_VALUE && movedown == Integer.MAX_VALUE) {
			moveright = 0;
		}
		return grid[row][col] + Math.min(moveright, movedown);

	}

	public static int dfs(int[][] grid, int row, int col, Map<String, Integer> map) {

		if (row == grid.length || col == grid[0].length) {
			return Integer.MAX_VALUE;
		}

		if (map.get(row + "-" + col) != null) {
			return map.get(row + "-" + col);
		}

		int moveright = dfs(grid, row, col + 1, map);
		int movedown = dfs(grid, row + 1, col, map);
		if (moveright == Integer.MAX_VALUE && movedown == Integer.MAX_VALUE) {
			moveright = 0;
		}
		int pathsum = grid[row][col] + Math.min(moveright, movedown);
		map.put(row + "-" + col, pathsum);
		return map.get(row + "-" + col);

	}

}