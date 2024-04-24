package binarysearch.bsonanswers;

import java.util.*;

public class AllocateMinimumNumberOfPages {
    public static void main(String[] args) {

        List<Integer> a̦rr = Arrays.asList(25, 46, 28, 49, 24);
        int n = 5;
        int m = 4;
        int ans = findPages(a̦rr, n, m);
        System.out.println("The answer is: " + ans);
    }

    public static int findPages(List<Integer> arr, int n, int m) {
        if (m > n)
            return -1;

        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        while (low < -high) {
            int mid = low + (high - low) / 2;
            int students = countStudents(arr, mid);
            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int countStudents(List<Integer> arr, int pages) {
        int n = arr.size();
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                pagesStudent += arr.get(i);
            } else {
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }
}
