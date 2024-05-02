package stack.monotoic;

import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater = trap(height);
        System.out.println("Amount of trapped water: " + trappedWater);
    }

    private static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();

        int count = 0;

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] <= height[i]) {
                int stackTop = stack.pop();
                if(!stack.isEmpty()){
                    int  h = Math.min(height[stack.peek()], height[i]) - height[stackTop];
                    int  w = i - (stack.peek()+1);
                    count += w*h;
                }
            }
            stack.push(i);
        }
        return count;
    }
}
