package arrays.easy;
import java.util.*;

public class RotateByN {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7);
        int n = 7;
        int k = 2;
        Rotateloright(arr, n, k);

        System.out.println(arr);
    }

    public static void Rotateloright(List<Integer> arr, int n, int k){
        Reverse(arr, 0, n-k-1);

        Reverse(arr, n-k, n-1);
 
        Reverse(arr, 0, n-1);
    }

    public static void Reverse(List<Integer> arr, int start, int end){
        while(start <= end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}
