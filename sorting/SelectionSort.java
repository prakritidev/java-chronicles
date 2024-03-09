package sorting;

import java.util.Arrays;
import java.util.List;

/**
 * SelectionSort
 */
public class SelectionSort {

  public static void main(String[] args) {
    List<Integer> input = Arrays.asList(10,9,8,7,6,5,4,3,2,1,0);
    sort(input);
    System.out.println(input);
  }

  public static void sort(List<Integer> input) {

    /**
     * 
     */

    for (int i = 0; i < input.size(); i++) {
      for (int j = i + 1; j < input.size(); j++) {
        if (input.get(j) < input.get(i)) {
          Integer temp = input.get(i);
          input.set(i, input.get(j));
          input.set(j, temp);
        }
      }
    }
  }
}
