package binarysearch.oned;

import java.util.Arrays;
import java.util.List;

public class RotatetdSearch {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7, 8, 1, 2, 3, 3, 3, 4, 5, 6);
        Integer k = 3;

        int ans = search(input, k);

        System.out.println(ans);

    }

    private static int search(List<Integer> input, Integer target) {

        int low = 0, high = input.size() - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (target == input.get(mid))
                return mid;

            if(input.get(low) ==  input.get(mid) && input.get(mid) == input.get(high)){
                low++;
                high--;
                continue;
            }
            if (input.get(low) <= input.get(mid)) {
                if (input.get(low) <= target && target <= input.get(mid)) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if(input.get(mid) <=target && target <= input.get(high)){
                    low = mid + 1;
                } else {
                    high = mid -1;
                }
            }
        }

        return -1;
    }
}
