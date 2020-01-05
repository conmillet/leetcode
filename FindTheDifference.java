package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {

        int charCode = t.charAt(s.length());
        for (int i = 0; i < s.length(); i++) {
            charCode -= (int)s.charAt(i);
            charCode += (int)t.charAt(i);
        }
        return (char)charCode;

//        char c = 0;
//        for (int i = 0; i < s.length(); i++) {
//            c ^= s.charAt(i);
//        }
//        for (int i = 0; i < t.length(); i++) {
//            c ^= t.charAt(i);
//        }
//        return c;
    }
}
