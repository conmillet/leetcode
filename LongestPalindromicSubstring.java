package leetcode;

public class LongestPalindromicSubstring {
    public String longestPalindrom(String s) {
        int len = s.length();
        if (s == null || len < 2) return s;
        int start = 0, end = 0;
        for (int i = 0; i < len - 1; i++) {
            int len1 = extendPalindrome(s, i, i);
            int len2 = extendPalindrome(s, i, i + 1);
            int length = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int extendPalindrome(String s, int l, int r) {
        while (l >= 0 && r <= s.length() && s.charAt(l) == s.charAt(r));
        l--;
        r++;
        return r - l + 1;
    }



//        int len = s.length();
//        String res = null;
//
//        boolean[][] dp = new boolean[len][len];
//
//        for (int i = len - 1; i >= 0; i--) {
//            for (int j = i; j < len; j++) {
//                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i <=2 || dp[i + 1][j - 1]);
//                if (dp[i][j] && (res ==null || j - i + 1 >res.length())) {
//                    res = s.substring(i, j + 1);
//                }
//            }
//        }
//        return res;
}
