package string;

import java.util.HashMap;
import java.util.Map;

public class IsomorpohicStrings {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";

        Boolean response = getIsomorphic(s, t);
        System.out.println(response);
    }

    private static Boolean getIsomorphic(String s, String t) {
        /**
         * p => t
         * a => i
         * p => t
         * e => l
         * r => e
         */
        if (s.length() != t.length())
            return false;
        
        int map1[] = new int[26];
        int map2[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if(map1[s.charAt(i)] != map2[t.charAt(i)]){
                return false;
            }

            map1[s.charAt(i)] = i+1;
            map2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
