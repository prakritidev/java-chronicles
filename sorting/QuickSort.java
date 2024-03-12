package sorting;

import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10,9,8,7,6,5,4,3,2,1,0);
        sort(input);
        System.out.println(input);
    }

    private static void sort(List<Integer> input) {
        quicksort(input, input.size()-1);
    }

    private static void quicksort(List<Integer> input, int i) {
        throw new UnsupportedOperationException("Unimplemented method 'quicksort'");
    }
}
