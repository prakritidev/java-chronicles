package binarysearch.bsonanswers;

public class SplitArrayLasgestSum {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int k = 2;
        int ans = largestSubarraySumMinimized(a, k);
        System.out.println("The answer is: " + ans);
    }

    private static int largestSubarraySumMinimized(int[] a, int k) {
        int low = a[0];
        int high = 0;
        for (int i = 0; i < a.length; i++) {
            low = Math.max(low, a[i]);
            high += a[i];
        }

        while (low <=high) {
            int mid = (low + high) / 2;
            int partitions = countPartition(a, mid);
            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int countPartition(int[] a, int maxSum) {
        int n = a.length;
        int partitions = 1;
        long subarraySum = 0;
        for (int i = 0; i < n; i++) {
            if (subarraySum + a[i] <=maxSum) {
                subarraySum += a[i];
            } else {
                partitions++;
                subarraySum = a[i];
            }
        }
        return partitions;
    }

}
