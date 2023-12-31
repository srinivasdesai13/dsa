package com.sd.dsa.graphs;

import java.util.HashMap;
import java.util.Map;

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

	public int findMaxPathSumUsingMemoization() {
		Map<String, Integer> memo = new HashMap<>();
		int maxPath = dfs(grid, 0, 0, memo);
		System.out.println(" maxPath= " + maxPath);
		return maxPath;
	}

	public int dfs(int[][] gird, int row, int col, Map<String, Integer> memo) {
		if (row >= grid.length || col >= grid[0].length) {
			return 0;
		}

		if (memo.get(row + "-" + col) != null) {
			return memo.get(row + "-" + col);
		}
		int total = grid[row][col] + Math.max(dfs(grid, row, col + 1, memo), dfs(grid, row + 1, col, memo));
		memo.put(row + "-" + col, total);
		return total;
	}

	
	public int findMaxPathSumUsingDP() {
        int rows = this.grid.length;
        int cols = this.grid[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = this.grid[0][0];
        for(int col=1;col<cols;col++){
            dp[0][col] = this.grid[0][col]+dp[0][col-1];
        }
        
        for(int row=1;row<rows;row++){
            dp[row][0] = this.grid[row][0]+dp[row-1][0];
        }
        
        for(int row=1;row<rows;row++){
            for(int col=1;col<cols;col++){
                dp[row][col] = this.grid[row][col]+Math.max(dp[row-1][col],dp[row][col-1]);
            }
        }
        return dp[rows-1][cols-1];
    }
    
	
	
	public static void main(String[] args) {
		int[][] grid =  {{1, 3, 1},
		        {1, 5, 1},
		        {4, 2, 1}};

		// 3,10,11,13
		// 5 16 21 30
		// 9 17 23 30
		FindMaxPathSum myGrid = new FindMaxPathSum(grid);

		// Call the findMaxPathSum method and print the result.
		long start = System.nanoTime();
		int maxPathSum = myGrid.findMaxPathSumUsingMemoization();
		long end = System.nanoTime();
		System.out.println("total-time = " + (end - start));
		System.out.println("Maximum path sum: " + maxPathSum);
	}
}