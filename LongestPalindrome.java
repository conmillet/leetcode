package leetcode;

import java.util.HashSet;

public class LongestPalindrome {
    private int longestPalindrome(String s) {

        if (s == null || s.length() == 0) return 0;

        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count++;
            } else {
                set.add(s.charAt(i));
            }
        }

        if (!set.isEmpty()) {
            return count*2 + 1;
        } else {
            return count * 2;
        }
    }
}