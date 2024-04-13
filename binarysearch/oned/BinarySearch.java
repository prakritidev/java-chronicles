package binarysearch.oned;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(3, 4, 6, 7, 9, 12, 16, 17);
        Integer target = 6;

        System.out.println(iterativeSearch(input, target));
        System.out.println(recursiveSearch(input, target));

    }

    private static int iterativeSearch(List<Integer> input, Integer target) {
        int n = input.size();
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(input.get(mid).equals(target)) return mid;
            else if(input.get(mid) < (target)) low = mid + 1;
            else high = mid - 1 ;

        }
        return -1 ;
    }

    private static int recursiveSearch(List<Integer> input, Integer target) {
        return search(input, 0, input.size()-1, target);
    }

    private static int search(List<Integer> input, int low, int high, Integer target) {
        if(low > high) return -1;

        int mid = (low + high) / 2;
        if(input.get(mid) == target) return mid;
        else if (target > input.get(mid)) return search(input, mid+1, high, target);
        return search(input, low, mid-1, target);
    }    
}
