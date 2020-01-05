package leetcode;

import java.util.*;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        HashSet<Integer> numbers = new HashSet<Integer>();


        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!numbers.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}
