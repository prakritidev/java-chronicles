package stack.learning;
import java.util.Arrays;
import java.util.*;
import java.util.List;

/*
 * This is be resolve using nextGreaterElement but do it in reverse.
 */
public class PreviousGreaterElement {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(13, 8, 1, 5, 2, 5, 9, 7, 6, 12);
        List<Integer> response = getNextPreviousElement(input);
        System.out.println(response);
    }

    private static List<Integer> getNextPreviousElement(List<Integer> input) {
        List<Integer> response = new ArrayList<>(Collections.nCopies(input.size(), -1));
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < input.size(); i++){
            while (!stack.isEmpty() && input.get(stack.peek()) <= input.get(i)) {
                stack.pop();
            }

            if(!stack.isEmpty()) {
                response.set(i, stack.peek());
            }
            stack.push(i);
        }
        return response;

    }
}
