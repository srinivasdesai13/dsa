package com.sd.dsa.graphs;

public class Maze {
	
	/**
	 * Question: You are given a matrix representing a maze, where 'S' represents
	 * the start, 'E' represents the exit, '#' represents walls, and '.' represents
	 * open cells. Your task is to write a Java method to determine if it's possible
	 * to navigate from the start 'S' to the exit 'E' in the maze. You can move up,
	 * down, left, or right, but not diagonally.
	 * 
	 * 
	 */
	
	
	
	
	public static void main(String args[]) {
		char[][] maze = { { '#', '#', '#', '#', '#' }, { '#', 'S', '.', '.', '#' }, { '#', '.', '#', '.', '#' },
				{ '#', '.', '#', '.', 'E' }, { '#', '.', '.', '#', '#' }, { '#', '#', '#', '#', '#' } };
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		boolean canNavigate = canNavigate(maze, 1, 1, visited);
		// You cannot navigate from 'S' to 'E' in this maze because there's no path, so
		// canNavigate should be false.

		System.out.println("can Navigate " + canNavigate);

	}

	public static boolean canNavigate(char[][] maze, int row, int col, boolean[][] visited) {
		if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length || maze[row][col] == '#'
				|| visited[row][col]) {
			return false;
		}

		if (maze[row][col] == 'E') {
			return true;
		}

		visited[row][col] = true;

		return (canNavigate(maze, row + 1, col, visited) || canNavigate(maze, row - 1, col, visited)
				|| canNavigate(maze, row, col + 1, visited) || canNavigate(maze, row, col - 1, visited));

	}

}
