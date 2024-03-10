package arrays.easy;

public class CountConsecutiveOne {
    public static void main(String[] args) {
        int nums[] = { 1, 0, 1, 1, 0, 1 };
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }

    private static int findMaxConsecutiveOnes(int[] arr) {
        int maxLen = 0;
        int tempLen = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]){
                tempLen++;
                maxLen = Math.max(maxLen, tempLen);
            } else{
                tempLen = 0;
            }

        }
       return Math.max(maxLen, tempLen) + 1;
    }
}
