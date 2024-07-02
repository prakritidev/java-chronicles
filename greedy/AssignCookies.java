package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * AssignCookies
 * 
 * 
 */
public class AssignCookies {

  public static void main(String[] args) {
    List<Integer> g = Arrays.asList(1,2);
    List<Integer> s = Arrays.asList(1,2,3);
    
    Integer result = getSatisfied(g,s);
    System.out.println(result);
  }

  private static Integer getSatisfied(List<Integer> g, List<Integer> s) {
    Collections.sort(g);
    Collections.sort(s);

    int count = 0 ;
    int i = 0, j = 0;

    while (i < g.size() && j < s.size()) {
      if(g.get(i) == s.get(i)) count++; 
      i++;
      j++;
    }
    return count;
  }
}
