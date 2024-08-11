package graphquestions;

import java.util.*;

public class DFS {

    private final Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int source, int destination) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);

    }

    public void dfs(int node) {
        Set<Integer> visited = new HashSet<>();
        dsfRecusive(node, visited);
    }

    private void dsfRecusive(int node, Set<Integer> visited) {
        if (visited.contains(node)) {
            return;
        }
        visited.add(node); 
        System.out.println("Visited node: " + node);
        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            dsfRecusive(neighbor, visited);
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS();
        // Add edges to the graph
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 6);

        graph.dfs(1);
    }
}
