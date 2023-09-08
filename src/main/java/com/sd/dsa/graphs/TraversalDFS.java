package com.sd.dsa.graphs;

import java.util.*;
public class TraversalDFS {

	public static void main(String[] args) {
	
		Graph<String> graph = new Graph<>();
		graph.addNode("a");
		graph.addNode("b");
		graph.addNode("c");
		graph.addNode("d");
		graph.addNode("e");
		graph.addNode("f");
		
		graph.addEdge("a", "b");
		graph.addEdge("a", "c");
		graph.addEdge("b", "d");
		graph.addEdge("c", "e");
		graph.addEdge("d", "f");

		dfs(graph);
	}
	
	
	public static void dfs(Graph g) {
		Stack<String> stack = new Stack<>();
		
		stack.add("a");
		
		while(!stack.isEmpty()) {
			String node = stack.pop();
			System.out.println(node);
			List<String> nList = g.getNeighbors(node);
			
			if(nList!=null && nList.size()>0) {
				for(String s:nList) {
					stack.add(s);
				}
			}
			
		}
		
	}

}
