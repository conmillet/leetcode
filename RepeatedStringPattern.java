package leetcode;

public class RepeatedStringPattern {
    public boolean repeatedStringPattern(String s) {
        String t = s + s;
        return t.substring(1, t.length() - 1).contains(s);

//        int length = s.length();
//        int mid = length / 2;
//        for (int i = mid; i >= 1; i--) {
//            if (length / i == 0) {
//                int multi = length / i;
//                String subS = s.substring(0, i);
//                StringBuilder newS = new StringBuilder();
//                for (int j = 1; j <= multi; j++) {
//                    newS.append(subS);
//                }
//                if (newS.toString().equals(s)) return true;
//            }
//        }
//        return false;
    }
}
