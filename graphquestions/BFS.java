package graphquestions;

import java.util.*;
public class BFS {

    private HashMap<Integer, List<Integer>> graph = new HashMap<>();

    private void addEdge(int source, int destination) {
        graph.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        graph.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

     private void bfs(int start) {
        Set<Integer> visited = new HashSet<>();

        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            Integer pop = queue.poll();
            System.out.println("Visiting Node: " + pop);    
            for (Integer neighbor : graph.getOrDefault(pop, new ArrayList<>())) {
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS();  // Create a new graph

        // Add edges to the graph
        bfs.addEdge(1, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(2, 4);
        bfs.addEdge(3, 5);
        bfs.addEdge(4, 6);
        bfs.addEdge(5, 6);

        System.out.println("BFS traversal starting from node 1:");
        bfs.bfs(1);  // Perform BFS starting from node 1
    }
}
