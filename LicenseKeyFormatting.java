package leetcode;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {

        StringBuilder res = new StringBuilder();
        for (int i = S.length() - 1; i>= 0; i--) {
            if (S.charAt(i) != '-') {
                res.append(res.length() % (K+1) == K ? '-' : "").append(S.charAt(i));
            }
        }
        return res.reverse().toString().toUpperCase();
//        StringBuilder res = new StringBuilder();
//        int count = 0, index = S.length() - 1;
//        while (index >= 0) {
//            char curr = Character.toUpperCase(S.charAt(index));
//            if (curr == '-') {
//                index--;
//            } else if (count != 0 && count % K == 0) {
//                res.insert(0,curr);
//                count = 0;
//            } else {
//                res.insert(0,curr);
//                count++;
//                index--;
//            }
//        }
//        return res.toString();
    }
}
