package com.sd.dsa.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraversalBFS {

	public TraversalBFS() {
		// TODO Auto-generated constructor stub
	}

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

		bfs(graph);
	
	}

	private static void bfs(Graph<String> graph) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("a");
		while(!queue.isEmpty()) {
			String node = queue.poll();
			System.out.println(node);
			List<String> n = graph.getNeighbors(node);
			
			if(n!=null && n.size()>0) {
				for(String s:n) {
					queue.add(s);
				}
			}
		}
		
	}

}
