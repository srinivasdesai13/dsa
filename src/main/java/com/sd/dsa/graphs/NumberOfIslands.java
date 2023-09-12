package com.sd.dsa.graphs;

public class NumberOfIslands {
	
	/*
	 * 
	 * Problem: Number of Islands
	 * 
	 * Given a 2D grid map of '1's (land) and '0's (water), count the number of
	 * islands. An island is surrounded by water and is formed by connecting
	 * adjacent lands horizontally or vertically. You may assume all four edges of
	 * the grid are all surrounded by water.
	 * 
	 */
	
	
	public static void main(String args[]) {
		char[][] grid = {
				  {'1','1','1'},
				  {'0','0','0'},
				  {'1','1','1'}
				 };

		int response = numIslands(grid);
		System.out.println("response " + response);
	}

	public static int numIslands(char[][] grid) {
		boolean[][] visited = new boolean[grid.length][grid[0].length];

		int total = 0;

		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[0].length; c++) {
				if (dfs(grid, r, c, visited)) {
					total++;
				}

			}
		}
		return total;
	}

	public static boolean dfs(char[][] grid, int row, int col, boolean[][] visited) {
		if (row < 0 || row == grid.length || col < 0 || col == grid[0].length || grid[row][col] == '0'
				|| visited[row][col]) {
			return false;
		}
		visited[row][col] = true;
		dfs(grid, row + 1, col, visited);
		dfs(grid, row - 1, col, visited);
		dfs(grid, row, col + 1, visited);
		dfs(grid, row, col - 1, visited);

		return true;

	}

}