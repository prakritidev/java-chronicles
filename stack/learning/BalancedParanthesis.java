package stack.learning;

import java.util.Arrays;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String input = "()[{}()]";

        int tracker = 0;

        for (int i = 0; i < input.toCharArray().length; i++) {
            switch (input.charAt(i)) {
                case '(':
                    tracker++;
                    break;
                case '[':
                    tracker++;
                    break;
                case '{':
                    tracker++;
                    break;
                case ')':
                    tracker--;
                    break;
                case ']':
                    tracker--;
                    break;
                case '}':
                    tracker--;
                    break;
                default:
                    break;
            }
        }
        if (tracker == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
