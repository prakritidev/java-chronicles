package arrays.easy;

public class FindNumberAppearOnce {
    public static void main(String[] args) {
        int[] arr = new int[] {4,1,2,1,2};
        System.out.println(getNumber(arr));
    }

    private static int getNumber(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp ^= arr[i];
        }
        
        return temp;
    }
}
