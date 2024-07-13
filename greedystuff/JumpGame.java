package greedystuff;

public class JumpGame {

  public static void main(String[] args) {
    int[] nums = { 2, 3, 1, 1, 4 };
    System.err.println("Output: " + canJump(nums));
    System.err.println("Output: " + canJumpMin(nums));
  }

  private static boolean canJump(int[] nums) {
    int current = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > current)
        return false;
      current = Math.max(current, i + nums[i]);
    }
    return true;
  }

  private static int canJumpMin(int[] nums) {
    int current = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > current)
        return 0;
      current = Math.max(current, i + nums[i]);
    }
    return 0;
  }
}
