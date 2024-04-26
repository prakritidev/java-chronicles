package string;

import java.util.Stack;

/**
 * stack = ""
 * outpout = ()()
 */
public class RemoveOuterMostParathensis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeParanthesisString(s));
    }

    public static String removeParanthesisString(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        char[] charInput = input.toCharArray();
        for (int i = 0; i < charInput.length; i++) {
            if(stack.isEmpty()) {
                stack.push(charInput[i]);
                continue;
            }
            if (stack.size() == 1) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                if (charInput[i] == '(') {
                    stack.push('(');
                } else {
                    Character c = stack.pop();
                    result.append(c);
                    result.append(charInput[i]);
                }
            }

            
            
        }
        return result.toString();
    }
}
