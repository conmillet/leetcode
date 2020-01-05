package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public int firstUniqueChar(String s) {

        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;

//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            map.put(c, map.getOrDefault(c,0) + 1);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (map.get(s.charAt(i)) == 1) {
//                return i;
//            }
//        }
//        return -1;
    }
}