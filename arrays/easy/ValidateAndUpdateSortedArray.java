package arrays.easy;

import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ValidateAndUpdateSortedArray {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> input = IntStream.range(0, 50)
                                .map(i -> (int) random.nextInt(100))
                                .boxed()
                                .collect(Collectors.toList());

        System.out.println(input);

        Boolean status = checkSort(input);

        System.out.println(status);

        // Remove any duplicates in sorted array. 
        int[] arr = new int[] {1,2,2,2,2,3,4,5,6,7,7,7,7,7,8,10};
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]){
                j++;
                 
            } 
        }
        int[] slicedArray = Arrays.copyOfRange(arr, 0, j+1);
        for (int num : slicedArray) {
            System.out.print(num + " ");
        }
    }

    public static Boolean checkSort(List<Integer> input){
        
        return IntStream.range(0, input.size()-1)
                .noneMatch(i -> input.get(i) > input.get(i+1));
    }
}
