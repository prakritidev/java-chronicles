package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionArray {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> arr2 = Arrays.asList(2, 3, 4, 4, 5, 11, 12);

        List<Integer> result = new ArrayList<>();

        int left = 0, right = 0;

        while (left != arr1.size() - 1 && right != arr2.size() - 1) {
            if (arr1.get(left) <= arr2.get(right)) {
                result.add(arr1.get(left));
                left++;
                right++;
            } else {
                result.add(arr1.get(right));
                right++;
                left++;
            }
        }

        while (left != arr1.size() - 1) {
            result.add(arr1.get(left));
            left++;
        }

        while (right != arr1.size() - 1) {
            result.add(arr1.get(right));
            right++;
        }

        System.out.println(result);

    }
}
