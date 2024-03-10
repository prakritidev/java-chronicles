package arrays.easy;

import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,0,1,0,4,0);

        int start = 0, end = arr.size() - 1;

        while (arr.get(end).equals(0)) {
            end--;
        }

        while (start <= end) {
            if (arr.get(start).equals(0)) {
                arr.set(start, end);
                arr.set(end, 0);
                while (arr.get(end).equals(0)) {
                    end--;
                }
            }
            start++;
        }

        System.out.println(arr);
    }
}
