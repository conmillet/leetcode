package leetcode;

public class StringCompression {
    public int stringCompression(char[] chars) {
        int indexRes = 0, index = 0;
        while (index < chars.length) {
            char curr = chars[index];
            int count = 0;
            while (index < chars.length && chars[index] == curr) {
                index++;
                count++;
            }
            chars[index++] = curr;
            if (count != 1) {
                for (char c: Integer.toString(count).toCharArray()){
                    chars[indexRes++] = c;
                }
            }
        }
        return indexRes;
    }
}
