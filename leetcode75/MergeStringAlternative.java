
import java.util.*;

public class MergeStringAlternative {

  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "defsdfghjk";

    String result = getAlternativeString(s1, s2);
    System.out.println(result);
    System.out.println("Duck this view");
  }

  public static String getAlternativeString(String s1, String s2) {

    Integer l1 = s1.length(), l2 = s2.length();
    int i = 0, j = 0;

    StringBuilder sb = new StringBuilder();

    while (i < l1 && j < l2) {

      sb.append(s1.charAt(i));
      i++;
      sb.append(s2.charAt(j));
      j++;
    }

    while (i < l1) {
      sb.append(s1.charAt(i));
      i++;
    }

    while (j < l2) {
      sb.append(s2.charAt(j));
      j++;
    }
    return sb.toString();

  }
}
