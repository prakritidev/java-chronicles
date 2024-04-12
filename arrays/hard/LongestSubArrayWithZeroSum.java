import java.util.Arrays;
import java.util.*;

/*
 * one of the craziest things I've discoverted in this pattern that i was not able to visualise. 
 * 
 * We divide our array in two parts. and use hashmap as a reference for diving the array into two. 
 * 
 * 
 * We starting adding the number and keep track of the sum and any given moment we get the same sum that means when we get out first sum if as values of x but when we moved ahead and we still got sum x that means this extented poitions have zero contribution in the sum. Hence this second time we have seen x have 0 sum.
 * [[part 1] [part 2]]
 * 
 * [[5][5]] 
 * 
 * Ideally we should have 10 in second part but the fact that out total sum is still 5 tell me that the next part of the array has 0 sum. Hence we calculate the length by current index - last know index from the hasmap. 
 * 
 * Fuck this was easy, but i was not able to see this pattern. Coundlt have solved this in an interview setting.
 */
public class LongestSubArrayWithZeroSum {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(9, -3, 3, -1, 6, -5);
        System.out.println(getSolution(input));
    }

    public static Integer getSolution(List<Integer> input) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < input.size(); i++) {
            sum += input.get(i);

            if (sum == 0) {
                maxLength = i + 1;
            } else {
                if (sumMap.containsKey(sum)) {
                    maxLength = Math.max(maxLength, i - sumMap.get(sum));
                } else {
                    sumMap.put(sum, i);
                }
            }

        }

        return maxLength;
    }
}
