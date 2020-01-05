package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private List<String> fizzBuzz(int num) {

        List<String> res = new ArrayList<String>();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
