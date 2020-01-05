package leetcode;

public class ReverseString {

    public static String reversString(String s) {

        if (s == null || s.length() == 0) {
            return s;
        }

        char[] sArray = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            char leftChar = sArray[left];
            char rightChar = sArray[right];

            if (!isVowel(leftChar)) {
                left++;
            } else if (!isVowel(rightChar)) {
                right--;
            } else {
                sArray[left] = rightChar;
                sArray[right] = leftChar;
                left++;
                right--;
            }
        }
        return new String(sArray);
    }

    private static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U');
    }
}
