package arrays.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * StockBuyAndSell
 * 
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and
 * sell on day 5 (price = 6), profit = 6-1 = 5.
 * peek < incoming => (find difference)
 *
 * 
 */

public class StockBuyAndSell {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(7,1,5,7,6,4,3,1,6,4);
        // int respose = getProfit(input);
        int respose = getProfitSimpleImplementation(input);
        System.out.println(respose);
    }

    public static int getProfit(List<Integer> input) {
        Integer result = 0;
        Stack<Integer> stack = new Stack<>();

        stack.push(input.get(0));
        for (int i = 1; i < input.size(); i++) {
            if (stack.isEmpty()) {
                stack.push(input.get(i));
                continue;
            }
            if (stack.peek() > input.get(i)) {
                stack.pop();
                stack.push(input.get(i));
            } else {
                int peek = stack.peek();
                result = Math.max(input.get(i) - peek, result);
            }
        }
        return result;
    }
    public static int getProfitSimpleImplementation(List<Integer> input) {
        Integer minPrice = Integer.MAX_VALUE;
        Integer profit = 0;
        for(int i = 0; i < input.size(); i++){
            minPrice = Math.min(minPrice, input.get(i));
            profit = Math.max(profit, input.get(i) - minPrice);
        }
        return profit;
    }
}
