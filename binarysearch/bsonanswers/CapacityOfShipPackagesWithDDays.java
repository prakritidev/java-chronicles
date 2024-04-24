package binarysearch.bsonanswers;

public class CapacityOfShipPackagesWithDDays {
    public static void main(String[] args) {
        int[] weights = { 5, 4, 5, 2, 3, 4, 5, 6 };
        int d = 5;
        int ans = leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);

    }

    private static int leastWeightCapacity(int[] weights, int d) {
        // create range for biunary search
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int w = findDays(weights, mid);
            if (w <= d) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }

    private static int findDays(int[] weights, int cap) {
        int days = 1;
        int load = 0;
        int n = weights.length;

        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }
}
