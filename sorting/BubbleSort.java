package sorting;

import java.util.List;
import java.util.Arrays;

public class BubbleSort {
    public static void main (String[] args){
        List<Integer> input = Arrays.asList(10,9,8,7,6,5,4,3,2,1,0);
        sort(input);
        System.out.println(input);
    }

    public static void sort(List<Integer> input){

        /**
         * [ 0<-i [][][]]
         * [j -> n]
         * 
         * [[[...], [j(max)]], [j(max)]]
         * 
         */
        int length = input.size();
        for (int i = length-1; i >=0 ; i--) {
            int didSwap = 0;
            for(int j = 0; j <= i -1; j ++){
                if(input.get(j) > input.get(j+1)){
                    Integer temp = input.get(j);
                    input.set(j, input.get(j+1));
                    input.set(j+1, temp);
                    didSwap=1;
                }
            }
            if(didSwap == 0) break;
        }
    }
}
