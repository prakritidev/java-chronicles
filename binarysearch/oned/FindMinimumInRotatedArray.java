package binarysearch.oned;

import java.util.Arrays;
import java.util.List;

public class FindMinimumInRotatedArray {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 5, 6, 7, 10, 12, 21, 34);
        System.out.println(getMinimum(input));

    }

    private static Integer getMinimum(List<Integer> input) {
        

        int low = 0, high = input.size() - 1, min = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (input.get(low) <= input.get(high)) {
                min = Math.min(min, input.get(low));
                break;
            }

            if (input.get(low) <= input.get(mid)) {
                min = Math.min(min, input.get(low));
                low = mid + 1;
            } else {
                min = Math.min(min, input.get(mid));
                high = mid - 1;
            }
        }

        return min;
    }
}
