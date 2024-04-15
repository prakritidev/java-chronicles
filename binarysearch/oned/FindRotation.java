package binarysearch.oned;

import java.util.Arrays;
import java.util.List;

public class FindRotation {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(4, 5, 6, 7, 10, 12, 21, 34);
        System.out.println(getRotationCount(input));
    }

    private static Integer getRotationCount(List<Integer> input) {
        int low = 0, high = input.size() - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (input.get(low) <= input.get(high)) {
                if (input.get(low) < ans) {
                    index = low;
                    ans = input.get(low);
                }
                break;
            }

            if (input.get(low) <= input.get(mid)) {
                if (input.get(low) < ans) {
                    index = low;
                    ans = input.get(low);
                }

                low = mid + 1;
            } else {

                if (input.get(mid) < ans) {
                    index = mid;
                    ans = input.get(mid);
                }

                high = mid - 1;

            }
        }
        return index;
    }
}
