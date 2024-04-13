package binarysearch.oned;

import java.util.*;

public class LastOccurence {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 4, 13, 13, 13, 20, 40);
        Integer target = 13;
        System.out.println(findPosition(input, target));
    }

    private static int findPosition(List<Integer> input, Integer target) {
        int start = 0;
        int end = input.size() - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (input.get(mid).equals(target)) {
                res = mid;
                start = mid + 1;
            } else if (target < input.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
}
