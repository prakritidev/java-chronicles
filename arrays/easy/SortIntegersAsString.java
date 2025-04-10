package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * SortIntegersAsString
 */
public class SortIntegersAsString {

  static class NumberWrapper {
    String original;
    String trimmed;

    NumberWrapper(String original) {
      this.original = original;
      this.trimmed = original.replaceFirst("^0+(?!$)", "");
    }
  }

  public static void main(String[] args) {
    List<String> input = Arrays.asList("2", "10000000000000000000000000000000000000000001",
        "1",
        "100",
        "1234567890123456789012345678901234567890",
        "00000001",
        "0000000000000000000000000000000000000000002");

    List<NumberWrapper> numbers = new ArrayList<>();
    for (String s : input) {
      numbers.add(new NumberWrapper(s));
    }

    numbers.sort((a, b) -> {
      if (a.trimmed.length() != b.trimmed.length())
        return a.trimmed.length() - b.trimmed.length();
      return a.trimmed.compareTo(b.trimmed);
    });

    for (NumberWrapper num : numbers) {
      System.out.println(num.original);
    }
  }
}
