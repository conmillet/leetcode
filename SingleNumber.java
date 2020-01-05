package leetcode;

import java.util.HashSet;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i: nums) {
            if (set.contains(i)) {
                set.remove(i);
            }else {
                set.add(i);
            }
        }

        for (int i: set) {
            return i;
        }
        return -1;
    }
}
