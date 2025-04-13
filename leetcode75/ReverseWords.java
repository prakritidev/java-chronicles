public class ReverseWords {

  public static String reverseWords(String s) {
      // Trim leading and trailing spaces and split by spaces
      String[] words = s.trim().split("\\s+");
      StringBuilder reversedString = new StringBuilder();
      
      // Iterate from the end of the words array
      for (int i = words.length - 1; i >= 0; i--) {
          reversedString.append(words[i]);
          if (i > 0) {
              reversedString.append(" ");
          }
      }
      
      return reversedString.toString();
  }

  public static void main(String[] args) {
      System.out.println(reverseWords("the sky is blue"));  // Output: "blue is sky the"
      System.out.println(reverseWords("  hello world  "));  // Output: "world hello"
      System.out.println(reverseWords("a good   example")); // Output: "example good a"
  }
}
