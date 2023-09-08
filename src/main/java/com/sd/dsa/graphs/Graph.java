package com.sd.dsa.graphs;

import java.util.*;

public class Graph<T> {
    private Map<T, List<T>> adjacencyMap;

    public Graph() {
        adjacencyMap = new HashMap<>();
    }

    public void addNode(T node) {
        if (!adjacencyMap.containsKey(node)) {
            adjacencyMap.put(node, new ArrayList<>());
        } else {
            System.out.println("Node " + node + " already exists in the graph.");
        }
    }

    public void addEdge(T source, T destination) {
        if (!adjacencyMap.containsKey(source)) {
            System.out.println("Source node " + source + " does not exist in the graph.");
        } else {
            adjacencyMap.get(source).add(destination);
        }
    }

    public List<T> getNeighbors(T node) {
        if (!adjacencyMap.containsKey(node)) {
            System.out.println("Node " + node + " does not exist in the graph.");
            return Collections.emptyList();
        } else {
            return adjacencyMap.get(node);
        }
    }

    public Set<T> getAllNodes() {
        return adjacencyMap.keySet();
    }
}
