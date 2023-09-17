package com.sd.dsa.graphs;

import java.util.*;

public class BFSTraversal {
	
	
	
	/*
	 * Question: You are given a directed graph represented as an adjacency list and
	 * a starting node. Implement a function in Java called bfs to perform a
	 * Breadth-First Search starting from the given node and return the order in
	 * which nodes are visited.
	 * 
	 */
	
	
	
	public static void main(String args[]) {
		Map<Integer, List<Integer>> graph = new HashMap<>();
		graph.put(0, Arrays.asList(1, 2));
		graph.put(1, Arrays.asList(2));
		graph.put(2, Arrays.asList(3, 4));
		graph.put(3, Arrays.asList(4));
		graph.put(4, new ArrayList<>());

		int startNode = 0;

		List<Integer> result = bfs(graph, startNode);

		// After BFS traversal, result should be [0, 1, 2, 3, 4]

		// After BFS traversal, result should be [2, 0, 3, 1]

		System.out.println("Sum of x+y = " + result);
	}

	public static List<Integer> bfs(Map<Integer, List<Integer>> graph, int startNode) {
		List<Integer> response = new ArrayList<>();
		Queue<Integer> queue = new ArrayDeque<>();
		Set<Integer> visited = new HashSet<>();

		queue.offer(startNode);

		while (!queue.isEmpty()) {
			int node = queue.poll();
			if (visited.contains(node)) {
				continue;
			}
			visited.add(node);
			response.add(node);

			if (graph.get(node) != null) {
				List<Integer> list = graph.get(node);

				for (Integer next : list) {
					queue.add(next);
				}

			}

		}

		return response;

	}

}