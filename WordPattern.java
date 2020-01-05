package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");

        if (pattern.length() != words.length) return false;

        HashMap index = new HashMap();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (index.containsKey(c)) {
                if (!index.get(c).equals(words[i])) return false;
            } else {
                if (index.containsValue(words[i])) return false;
                index.put(c, words[i]);
            }
        }
        return true;
    }
}