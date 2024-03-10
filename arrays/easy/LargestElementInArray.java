package arrays.easy;

import java.util.Arrays;
import java.util.List;

public class LargestElementInArray {
    public static void main(String[] args){
        List<Integer> input = Arrays.asList(1,2,3,4);
        Integer max = Integer.MIN_VALUE;
        Integer secondMax = Integer.MIN_VALUE;

        for (Integer integer : input) {
            if(integer > max) {
                secondMax = max;
                max = integer;

            } 
        }

        System.out.printf("First Max is " + max + "\n");
        System.out.printf("Second Max value is: " +secondMax + "\n");
    }
}
