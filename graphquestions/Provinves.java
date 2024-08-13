package graphquestions;

import java.util.*;

/**
 * Provinves
 */
public class Provinves {

    private Map<Integer, List<Integer>> adjList = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    Integer answer = 0;

    private void addNode(Integer source, Integer destination) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    private void dfs(int node) {
        if (!visited.contains(node)) {
            answer++;
            dsfRecusive(node, visited);
            
        }
    }

    private void dsfRecusive(int node, Set<Integer> visited) {
        if (!visited.contains(node)) {
            return;
        }
        visited.add(node);
        System.out.println("Visited node: " + node);
        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            dsfRecusive(neighbor, visited);
        }
    }

    public static void main(String[] args) {
        Provinves provinves = new Provinves();

        provinves.addNode(0, 1);
        provinves.addNode(1, 0);
        provinves.addNode(2, 1);
        provinves.addNode(0, 0);
        provinves.addNode(1, 1);
        provinves.addNode(2, 0);
        provinves.addNode(0, 1);
        provinves.addNode(1, 0);
        provinves.addNode(2, 1);

        for (Integer i : Arrays.asList(0, 1, 2)) {
            if (!provinves.visited.contains(i)) {
                provinves.dfs(i);
            }
        }
        System.out.println("Answer" + provinves.answer);
    }
}
