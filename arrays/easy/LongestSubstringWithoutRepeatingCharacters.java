package arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Set;


/**
 * LongestSubstringWithoutRepeatingCharacters
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

        String input = "abcabcbb";

        Integer result = longestSubstringWithoutRepeatingCharacters.getLength(input);
        System.out.println(result);
    }

    public Integer getLength(String input) {
	Set<Character> set = new HashSet<>();
	int left = 0, max = 0;
	for(int i = 0; i < input.length(); i++) {
	    char ch = input.charAt(i);
	    while(set.contains(ch)) {
	    	set.remove(input.charAt(left));
		left++;
            }
	    set.add(ch);
	    max = Math.max(max, i - left + 1);
	}
        return max;

    }
}
