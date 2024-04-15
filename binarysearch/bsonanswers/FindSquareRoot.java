package binarysearch.bsonanswers;

public class FindSquareRoot {
    public static void main(String[] args) {
        System.out.println(getSquareRoot(125, 2));
    }

    private static float getSquareRoot(int i, int j) {
        float low = 1, high = i;

        while (low <= high) {
            float mid = low + (high - low) / 2;
            if(Math.pow(mid, j) == i) return mid;
            if(Math.pow(mid, j) >= (long)(i)) {
                high = (int)(mid -1);
            } else {
                low = (int)(mid + 1);
            }
        }

        return -1;
    }
}
