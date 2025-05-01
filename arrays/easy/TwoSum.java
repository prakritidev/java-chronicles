package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * TwoSum
 */
public class TwoSum {

  public static void main(String[] args) {
    List<Integer> input = Arrays.asList(2, 7, 11, 15);
    Integer target = 9;
    System.out.println(getSum(input, target));
  }

  public static List<Integer> getSum(List<Integer> input, Integer target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < input.size(); i++) {
      int complement = target - input.get(i);
      if (map.containsKey(complement)) {
        return List.of(map.get(complement), i);
      } else {
        map.put(input.get(i), i);
      }
    }
    return List.of(-1, -1);
  }
}
