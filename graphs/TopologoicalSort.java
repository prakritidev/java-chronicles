package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TopologoicalSort {
	
	private Map<Integer, List<Integer>> adjList = new HashMap<>();
	private Map<Integer, Integer> indegree = new HashMap<>();

	private void add(Integer source, Integer destination) {
			adjList.computeIfAbsent(source,k -> new ArrayList<>()).add(destination);
			indegree.put(source, indegree.getOrDefault(source, 0) + 1);	


			adjList.computeIfAbsent(destination,k -> new ArrayList<>()).add(source);
			indegree.put(destination, indegree.getOrDefault(destination, 0) + 1);	
	}
	
	private List<Integer> topoSort() {
		List<Integer> response = new ArrayList<>();

		Queue<Integer> queue = new LinkedList<>();
		
		for (Map.Entry<Integer, Integer> en : indegree.entrySet()) {
			Integer key = en.getKey();
			Integer val = en.getValue();

			if (val > 0) {
				queue.add(key);
			}
		}

		while (!queue.isEmpty()) {
			Integer vertex = queue.poll();
			List<Integer> neigbhors = adjList.get(vertex);						

			response.add(vertex);
			indegree.put(vertex, indegree.get(vertex) - 1);

			for (Integer neigbhor : neigbhors) {
				indegree.put(neigbhor, indegree.get(neigbhor) -1);

				if(indegree.get(neigbhor) == 0) {
					queue.add(neigbhor);
				}
			}
		}

		
		return response;

	}
	public static void main(String[] args) {
		TopologoicalSort topologoicalSort = new TopologoicalSort();

		topologoicalSort.add(5, 2);
		topologoicalSort.add(5, 0);
		topologoicalSort.add(4, 0);
		topologoicalSort.add(4, 1);
		topologoicalSort.add(2, 3);
		topologoicalSort.add(3, 1);
		
		List<Integer> result = topologoicalSort.topoSort();

	}
}
