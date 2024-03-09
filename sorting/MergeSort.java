package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        Integer[] arr = input.toArray(new Integer[input.size()]);
        System.out.println(arr.length);
        sort(input, 0, input.size()-1);
        System.out.println(input);
    }

    private static void sort(List<Integer> input, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        sort(input, low, mid);
        sort(input, mid+1, high);
        merge(input, low, mid, high);

    }

    private static void merge(List<Integer> input, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (input.get(left) <= input.get(right)) {
                temp.add(input.get(left));
                left++;
            } else {
                temp.add(input.get(right));
                right++;
            }
        }

        while (left <= mid) {
            temp.add(input.get(left));
            left++;
        }

        while (right <= mid) {
            temp.add(input.get(right));
            right++;
        }

        input = temp;

    }
}
