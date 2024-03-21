package arrays.medium;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LeaderInArray {
  public static void main(String[] args) {
    List<Integer> input = Arrays.asList(10, 22, 12, 3, 0, 6);
    List<Integer> respose = getLeader(input);
    System.out.println(respose);
  }

  public static List<Integer> getLeader(List<Integer> input) {
    List<Integer> respose = new ArrayList<>();
    respose.add(input.get(input.size() - 1));
    Integer maxValue = input.get(input.size() - 1);
    for (int i = input.size() - 2; i >= 0; i--) {
      if (maxValue != Math.max(maxValue, input.get(i))) {
        maxValue = Math.max(maxValue, input.get(i));
        respose.add(0, maxValue);
      }
    }
    return respose;
  }
}
