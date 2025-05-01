package arrays.easy;

public class TargetSumK {
  public static void main(String[] args) {
    int[] arr = new int[] { 2, 3, 5 };
    int target = 5;

    int[] respose = getData(arr, target);
    System.out.println(respose);
  }

  private static int[] getData(int[] arr, int target) {
    int[] respose = new int[2];

    int global_max = Integer.MIN_VALUE;
    int local_max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      local_max += arr[i];
      global_max = Math.max(local_max, global_max);
    }

    return respose;
  }
}
