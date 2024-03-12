package arrays.easy;

/**
 * We need to check for earch subarray if sum is target or not if yes then
 * update the global length variable.
 * 
 * second: increase the point if total subarray sum is less that target if its
 * greater than target then decrease the slow pointer. and get the count.
 */
public class TargetSumKLongestSubArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1,2,1,1,1, 5 };
        int target = 5;

        int response = getData(arr, target);

        System.out.println(response);

    }

    private static int getData(int[] arr, int target) {

        int n = arr.length-1;

        int left = 0, right = 0;
        long sum = arr[0];
        int maxLen = 0;

        while (right < n) {
            while (left <= right && sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target)
                maxLen = Math.max(maxLen, right - left + 1);

            right++;
            if (right < target)
                sum += arr[right];
        }
        return maxLen;
    }
}
