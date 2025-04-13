package twopointer;

import java.util.HashMap;

class LongestSubstringWithoutRepeatingCharacter {
  public static void main(String[] args) {
    String inputString = "bbbbb";
    Integer result = getCount(inputString);
    System.out.println(result);
  }

  static Integer getCount(String inputString) {
    int i = 0, j = 0;
    Integer result = 0;
    HashMap<Character, Integer> set = new HashMap<>();
    for (i = 0; i < inputString.length(); i++) {
      if (set.containsKey(inputString.charAt(i))) {
        j = set.get(inputString.charAt(i));
        result = Math.max(result, j - i);
      } else {
        set.put(inputString.charAt(i), i);
      }
    }
    return set.size();
  }
}
