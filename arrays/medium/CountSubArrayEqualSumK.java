package arrays.medium;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * [6,3,1,2,4,2,3,3,6,1]
 * 
 * local sum = 6
 */
public class CountSubArrayEqualSumK {
    public static void main(String[] args) {
        Integer target = 6;
        List<Integer> input = Arrays.asList(3,1,2,4,2,3,3,6,1);
        System.out.println(getCountSubArray(input, target));
    }

    private static Integer getCountSubArray(List<Integer> input, Integer target) {
        Integer response = 0;
        Integer localSum = 0;
        Integer i = 0, j = 0;

        while (j < input.size()) {
            localSum += input.get(j);

            while (localSum > target && i <= j) {
                localSum -= input.get(i);
                i++;
            }

            if (localSum.equals(target)) {
                response++;
            }

            j++;
        
        }
        return response;
    }
}
