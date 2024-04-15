package binarysearch.oned;

import java.util.Arrays;
import java.util.List;

public class FindPeakElement {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1);
        int ans = findPeak(input);
        System.out.println(ans);
    }

    private static int findPeak(List<Integer> input) {

        int n = input.size();

        if (n == 1)
            return 0;
        if (input.get(0) > input.get(1))
            return 0;
        if (input.get(n - 1) > input.get(n - 2))
            return n - 1;

        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (input.get(mid - 1) < input.get(mid) && input.get(mid) > input.get(mid+1)) {
                return mid;
            }

            if (input.get(mid) > input.get(mid - 1)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
