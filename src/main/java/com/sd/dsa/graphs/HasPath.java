package com.sd.dsa.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class HasPath {

	public HasPath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		

		
		Graph<String> graph = new Graph<>();
		graph.addNode("f");
		graph.addNode("g");
		graph.addNode("h");
		graph.addNode("i");
		graph.addNode("j");
		graph.addNode("k");
		
		graph.addEdge("f", "g");
		graph.addEdge("f", "i");
		graph.addEdge("g", "h");
		graph.addEdge("i", "g");
		graph.addEdge("i", "k");
		graph.addEdge("j", "i");
		

		boolean response = bfs(graph,"g","k");
		System.out.println("response = "+response);
	
	

	}
	
	public static boolean bfs(Graph<String> graph, String source, String destination) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add(source);
		
		while(!queue.isEmpty()) {
			
			String current = queue.poll();
			if(current.equals(destination)) {
				return true;
			}
			for(String neighbour:graph.getNeighbors(current)) {
				queue.add(neighbour);
			}
			
		}
		
		return false;
		
	}
	
	public static boolean dfs(Graph<String> graph, String source, String destination) {
		
		
		if(source.equals(destination)) {
			return true;
		}
		
		for(String s:graph.getNeighbors(source)) {
			if(dfs(graph,s,destination)) {
				return true;
			}
		}
		
		return false;
	}

}
