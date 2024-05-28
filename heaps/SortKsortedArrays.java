
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class SortKsortedArrays {
  public static void main(String[] args) {
    int[][] inputArray = {
        { 1, 2, 3, 4 },
        { 2, 2, 3, 4 },
        { 5, 5, 6, 6 },
        { 7, 8, 9, 9 }
    };

    List<List<Integer>> matrix = createMatrix(inputArray);

    // Printing the matrix
    for (List<Integer> row : matrix) {
      System.out.println(row);
    }
  }

  public static List<List<Integer>> createMatrix(int[][] array) {
    return IntStream.range(0, array.length)
        .mapToObj(i -> IntStream.range(0, array[i].length)
            .mapToObj(j -> array[i][j])
            .collect(Collectors.toList()))
        .collect(Collectors.toList());
  }
  /**
   * Just push them in to a MinQueue it will sort all the arrays. 
   */
}
