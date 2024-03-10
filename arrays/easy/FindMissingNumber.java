package arrays.easy;

/*
 * XOR of a number to itself os always 0; 
 * XOR or\f a number to 0 os always the number itself; 
 * 
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int N = 5;
        int a[] = new int[] { 1, 3, 4,5 };
        int ans = missingNumber(a, N);
        System.out.println(ans);

    }

    public static int missingNumber(int[] a, int N) {
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ (i + 1);
        }

        xor1 = xor1 ^ N;
        return (xor1 ^ xor2);
    }
}
