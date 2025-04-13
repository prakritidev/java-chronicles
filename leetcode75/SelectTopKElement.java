import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class SelectTopKElement {
  public static void main(String[] args) {

    List<Integer> input = Arrays.asList(0, 1, 2, 2, 3, 3, 3);

    List<Integer> response = getTopK(input);

    System.out.println(response);
  }

  static public List<Integer> getTopK(List<Integer> input) {
    Map<Integer, Integer> map = new HashMap<>();

    for (Integer i : input) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> cache = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      cache.add(entry);
      if (cache.size() > 2) {
        cache.poll();
      }
    }

    List<Integer> result = new ArrayList<Integer>();
    while (!cache.isEmpty()) {
      result.add(cache.poll().getKey());
    }
    return result;
  }

}
