package com.sd.dsa.graphs;

public class FindMaxPathSum {
	
	/*
	 * 
	 * Question:
	 * 
	 * You are given a grid of numbers representing a 2D matrix. Each cell in the
	 * grid contains a positive integer. Write a Java method findMaxPathSum that
	 * finds the maximum path sum from the top-left corner (0,0) to the bottom-right
	 * corner (m-1, n-1) while moving only right or down in the grid. You can think
	 * of the grid as a directed acyclic graph (DAG), where each cell is a node, and
	 * you can only move right or down along the edges.
	 * 
	 * 
	 */
	

	private int[][] grid;

	public FindMaxPathSum(int[][] grid) {
		this.grid = grid;
	}

	public int findMaxPathSum() {

		int maxPath = dfs(grid, 0, 0);
		System.out.println(" maxPath= " + maxPath);
		return maxPath;
	}

	public int dfs(int[][] gird, int row, int col) {
		if (row >= grid.length || col >= grid[0].length) {
			return 0;
		}
		return grid[row][col] + Math.max(dfs(grid, row, col + 1), dfs(grid, row + 1, col));
	}

	public static void main(String[] args) {
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };

		// 3,10,11,13
		// 5 16 21 30
		// 9 17 23 30
		FindMaxPathSum myGrid = new FindMaxPathSum(grid);

		// Call the findMaxPathSum method and print the result.
		int maxPathSum = myGrid.findMaxPathSum();
		System.out.println("Maximum path sum: " + maxPathSum);
	}
}