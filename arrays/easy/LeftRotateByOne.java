package arrays.easy;

import java.util.Arrays;
import java.util.List;

public class LeftRotateByOne {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        int pos = arr.get(0);
        for(int i = 0; i < arr.size()-1; i++){
            arr.set(i, arr.get(i+1));
        }
        arr.set(arr.size()-1, pos);
        System.out.println(arr);

        
    }
}
