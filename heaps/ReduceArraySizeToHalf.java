import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * ReduceArraySizeToHalf
 */
public class ReduceArraySizeToHalf {

  public static void main(String[] args) {
    List<Integer> input = Arrays.asList(3, 3, 3, 3, 5, 5, 5, 2, 2, 7);
    Integer output = minSetSize(input);
    System.out.println(output);

  }

  public static Integer minSetSize(List<Integer> input) {
    int[] arr = input.stream().mapToInt(i -> i).toArray();
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer response = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(map.values());
        
        int target = (arr.length/2);

        while(!queue.isEmpty() && target >= 0) {
            if(target >=0){
                Integer polled = queue.poll();
                target = target - polled;
                response++;
            }
           queue.poll();
        }

        return response;
  }
}
