package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,-4,-5);
        System.out.println(getRearranged(input));
    }

    public static List<Integer> getRearranged(List<Integer> input) {
        List<Integer> postive = input.stream().filter(num -> num > 0).collect(Collectors.toList());
        List<Integer> negative =  input.stream().filter(num -> num < 0).collect(Collectors.toList());

        // Boolean flip = true;
        // int i = 0, j = 0;
        // while(i < postive.size() && negative){
        //     if (flip) {
        //         int data = postive.get(i);
        //     } else {
                
        //     }
        //     input.set(i, data);
        // }

        

        return input;
    }
}
