package leetcode;

import java.util.HashMap;

public class IsIsomorphic {
    public boolean isIsomorphic (String s, String t) {
        if (s.length() != t.length()) return false;

        int[] m1 = new int[256];
        int[] m2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (m1[c1] != m2[c2]) return false;
            m1[c1] = i + 1;
            m2[c2] = i + 1;
        }
        return true;


//        if (s.length() != t.length()) return false;
//
//        HashMap<Character,Character> pattern = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char si = s.charAt(i);
//            char ti = t.charAt(i);
//
//            if (pattern.containsKey(si)) {
//                if (pattern.get(si) != ti) return false;
//            } else {
//                if (pattern.containsValue(ti)) return false;
//                    pattern.put(si, ti);
//                }
//            }
//        return true;
    }
}

