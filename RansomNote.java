package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();
        for (char c: magazine.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (char c: ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            } else if (!map.containsKey(c)) return false;
            if (map.get(c) < 0) return false;
        }
        return true;

//        if (ransomNote.length() > magazine.length()) return false;
//
//        HashMap<Character,Integer> rMap = new HashMap<Character, Integer>();
//        HashMap<Character,Integer> mMap = new HashMap<Character, Integer>();
//        ArrayList<Character> temp = new ArrayList<Character>();
//
//        for (int i = 0; i < ransomNote.length(); i++) {
//            char r = ransomNote.charAt(i);
//            if (!rMap.containsKey(r)) {
//                rMap.put(r,1);
//                temp.add(r);
//            }else {
//                rMap.put(r, rMap.get(r) + 1);
//            }
//        }
//
//        for (int i = 0; i < magazine.length(); i++) {
//            char m = magazine.charAt(i);
//            if (!mMap.containsKey(m)) {
//                mMap.put(m, 1);
//            } else {
//                mMap.put(m, mMap.get(m) + 1);
//            }
//        }
//
//        if (rMap.size() > mMap.size()) {
//            return false;
//        } else {
//            for (char a: temp) {
//                if (mMap.get(a) == null || rMap.get(a) > mMap.get(a));{
//                    return false;
//                }
//            }
//        }
//        return true;
    }
}
