package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkista {

    static class Edge {

        int node;
        int weight;

        public Edge(Integer node, Integer weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {

        int node;
        int distance;

        Node(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    public static int[] dijkstra(List<List<Edge>> graph, int source) {
      int n = graph.size();
      int[] dist = new int[n];


      Arrays.fill(dist, Integer.MAX_VALUE);
      dist[source] = 0;

      PriorityQueue<Node> queue = new PriorityQueue<>();

      queue.add(new Node(source, 0));

      while (!queue.isEmpty()) {
        Node current = queue.poll();
        int currentNode = current.node;
        int currentDist = current.distance;

        for (Edge edge : graph.get(currentNode)) {
            int neighbor = edge.node;
            int weight = edge.node;
            int newDist = currentDist + weight;

            if(newDist < dist[neighbor]) {
              dist[neighbor] = newDist;
              queue.add(new Node(neighbor, newDist));
            }
        }
      }
      return dist;
    }

    public static void main(String[] args) {
      int n = 5; // Number of nodes (0, 1, 2, 3, 4)

      // Create the graph as an adjacency list
      List<List<Edge>> graph = new ArrayList<>();
      for (int i = 0; i < n; i++) {
          graph.add(new ArrayList<>());
      }

      // Add edges (node1, node2, weight)
      graph.get(0).add(new Edge(1, 6));  // A -> B (6)
      graph.get(0).add(new Edge(2, 1));  // A -> C (1)
      graph.get(2).add(new Edge(3, 2));  // C -> D (2)
      graph.get(3).add(new Edge(4, 3));  // D -> E (3)
      graph.get(1).add(new Edge(4, 5));  // B -> E (5)
      graph.get(3).add(new Edge(1, 2));  // D -> B (2)

      int source = 0;  // Starting node (A)

      // Perform Dijkstra's algorithm
      int[] distances = dijkstra(graph, source);

      // Output the shortest distances from the source
      System.out.println("Shortest distances from node " + source + ":");
      for (int i = 0; i < distances.length; i++) {
          System.out.println("Node " + i + " -> Distance: " + distances[i]);
      }
    }
}
