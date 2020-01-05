package leetcode;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        if (s.length() == 0 || s == null) return true;

        int indexS = 0, indexT = 0;
        while (indexT < t.length()) {
            if (t.charAt(indexT) == s.charAt(indexS)) {
                indexS++;
                if (indexS == s.length()) {
                    return true;
                }
            }
            indexT++;
        }
        return false;
    }
}
