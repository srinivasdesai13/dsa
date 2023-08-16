package com.sd.dsa.graphs;

public class CanReachGoal {
	
	/*
	 * You are given a matrix representing a maze. The matrix contains 0s and 1s,
	 * where 0 represents an open cell and 1 represents a blocked cell. You start
	 * from the top-left corner and your goal is to reach the bottom-right corner.
	 * You can only move down or right, and you can't move through blocked cells.
	 * Write a dynamic programming function to determine if you can reach the goal
	 * or not.
	 * 
	 */	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {
				{0, 0, 0, 0},
			    {0, 1, 0, 1},
			    {1, 1, 0, 0},
			    {0, 0, 0, 0}
            };
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            boolean response = canReach(grid,visited,0,0);
            System.out.println("response "+response);
	}
	
	
	public static boolean canReach(int[][] grid,boolean[][] visited, int r, int c) {
		
		if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || visited[r][c] || grid[r][c] ==1) {
			return false;
		}
		
		visited[r][c] = true;
		if(r==grid.length-1 || c==grid[0].length-1) {
			return true;
		}
		
		return (canReach(grid,visited,r,c+1) || canReach(grid,visited,r+1,c));
		
		
	}

}
