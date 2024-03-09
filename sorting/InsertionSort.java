package sorting;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10,9,8,7,6,5,4,3,2,1,0);
    sort(input);
    System.out.println(input);
    }

    public static void sort(List<Integer> inputList){
        for(int i = 1; i < inputList.size(); i++){
            int j = i-1;
            Integer curValue = inputList.get(i);
            while (j > 0 && inputList.get(j) > curValue) {
                inputList.set(j+1, inputList.get(j));
                j--;
            }
            inputList.set(j+1, curValue);
        }
    }
}
