package leetcode;

import java.util.*;

public class TwoSumUniquePairs {
    public int findUniquePairs(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] < target) {
                left++;
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                count++;
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            }
        }
        return count;
    }
}
