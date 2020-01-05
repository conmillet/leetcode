package leetcode;

import java.util.ArrayList;

public class ReverseWords {
    public static String reverseWords(String s) {
        String words[] = split(s);
        StringBuilder res = new StringBuilder();

        for (String word: words) {
            res.append((reverse(word)) + " ");
        }
        return res.toString().trim();
    }

    private static String[] split(String s) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words.add(word.toString());
                word = new StringBuilder();
            } else {
                word.append(s.charAt(i));
            }
        }
        words.add(word.toString());
        return words.toArray(new String[words.size()]);
    }

    private static String reverse(String s) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            word.insert(0, s.charAt(i));
        }
        return word.toString();
    }

//    public String reverseWords(String s) {
//        String[] word = s.split(" ");
//        StringBuilder res = new StringBuilder();
//
//        for (String w:word){
//            res.append(new StringBuffer(w).reverse().toString() + " ");
//        }
//        return res.toString().trim();
//    }

    public static void main(String[] args) {
        ReverseWords test = new ReverseWords();
        System.out.println(test.reverseWords("Let's take LeetCode contest"));
    }
}
