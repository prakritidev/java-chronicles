package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,-3,-1,-2,3);
        System.out.println(getRearranged(input));
    }

    public static List<Integer> getRearranged(List<Integer> input) {
        List<Integer> postive = input.stream().filter(num -> num > 0).collect(Collectors.toList());
        List<Integer> negative =  input.stream().filter(num -> num < 0).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;

        Boolean flip = true;

        while(i < postive.size() || j < negative.size()){
            if (flip) {
                result.add(k, postive.get(i)); 
                k++;
                i++;
                               
            } else {
                result.add(k, negative.get(j));
                k++;
                j++;
            }
            flip = !flip;
        }

        while (i < postive.size()) {
            result.addAll(postive);
        }
        while (i < postive.size()) {
            result.addAll(negative);
        }
        return result;
    }
}
