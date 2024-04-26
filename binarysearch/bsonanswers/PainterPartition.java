package binarysearch.bsonanswers;

import java.util.*;

public class PainterPartition {
    public static void main(String[] args) {
        List<Integer> boards = Arrays.asList(10,20,30,40);
        int k = 2;
        int ans = findLargestMinDistance(boards, k);
        System.out.println("The answer is: " + ans);

    }

    private static int findLargestMinDistance(List<Integer> boards, int k) {
        int low = Collections.max(boards);
        int high = boards.stream().mapToInt(Integer::intValue).sum();
        while(low <= high) {
            int mid = (low + high) / 2;
            int painters = countPainters(boards, mid);
            if (painters > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int countPainters(List<Integer> boards, int time) {
        int n = boards.size();
        int painters = 1;
        long boardPainters = 0;
        for (int i = 0; i < n; i++) {
            if (boardPainters + boards.get(i) <= time) {
                boardPainters += boards.get(i);
            } else {
                painters++;
                boardPainters = boards.get(i);
            }
        }
        return painters;
    }
}
