package stack.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextGreatedElement {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(13, 8, 1, 5, 2, 5, 9, 7, 6, 12);
        List<Integer> response = getNextGreaterElement(input);
        System.out.println(response);
    }

    private static List<Integer> getNextGreaterElement(List<Integer> input) {

        List<Integer> response = new ArrayList<>(Collections.nCopies(10, -1));

        Stack<Integer> s = new Stack<Integer>();

        for (int i = 0; i < input.size(); i++) {
            while (!s.isEmpty() && input.get(s.peek()) < input.get(i)) {
                Integer pop = s.pop();
                response.set(pop, input.get(i));
            }
            s.push(i);
        }
        return response;

    }
}
