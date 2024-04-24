package binarysearch.bsonanswers;

import java.util.Arrays;

public class AggresssiveCows {
    public static void main(String[] args) {
        int[] stalls = { 0, 3, 4, 7, 10, 9 };
        int k = 4;
        int ans = aggressiveCows(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);

    }

    private static int aggressiveCows(int[] stalls, int k) {
        // TODO Auto-generated method stub
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1, high = stalls[n - 1] - stalls[0];
        while (low <= high) {
            int mid = (low + high) / 2;
            if(canWePace(stalls, mid, k) == true){
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return high;
    }

    private static boolean canWePace(int[] stalls, int dist, int k) {
        int n = stalls.length;
        int cntCows = 1;
        int last = stalls[0];
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++;
                last = stalls[i];
            } 
            if(cntCows >= k) return true;
        }
        return false;
    }
}
