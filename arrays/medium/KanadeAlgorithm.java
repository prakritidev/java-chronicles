package arrays.medium;

import java.util.List;
import java.util.Arrays;


/**
 * Find the max sum subarray 
 * 
 * 
 * [-2,1,-3,4,-1,2,1,-5,4];
 * 
 * [-2, 1, -3, 4, -1, 2, 1, -5 ]
 */
public class KanadeAlgorithm {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(-2,1,-3,4,-1,2,1,-5,4);
        int respose = getSolution(arr);
        System.out.println(respose);
    }

    public static int getSolution(List<Integer> arr){
        int globalMax = Integer.MIN_VALUE;
        int localMax = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;

        for(int i = 0; i < arr.size(); i++){

            if(localMax == 0) start = i;

            localMax +=arr.get(i);
            
            if(localMax > globalMax) {
                
                globalMax = localMax;
                ansStart = start;
                ansEnd = i;

            }

            if(localMax < 0) localMax = 0;
        }

        if(globalMax <0 ) globalMax = 0;

        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.print("]\n");

        return globalMax;
        
    }
}
