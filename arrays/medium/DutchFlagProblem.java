package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 2,0,2,1,1,0 => 0,0,1,1,2,2
 * 
 * [i,j,k] => pointer of window.
 * 
 * 
 * 
 * [0,0,1,1,2,2]
 */
public class DutchFlagProblem {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] { 0, 2, 1, 2, 0, 1 }));
        sortArray(arr, arr.size());
        System.out.println(arr);

    }

    private static void sortArray(ArrayList<Integer> arr, int size) {
        Integer mid = 0, low = 0, high = size-1;

        while (mid <= high) {
            if (arr.get(mid).equals(0)) {
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                mid++;
                low++;
            } else if (arr.get(mid).equals(1)) {
                mid++;
            } else if (arr.get(mid).equals(2)) {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }

    }

    
}
