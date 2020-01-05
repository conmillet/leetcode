package leetcode;

import java.util.Arrays;

/**
 * 213. House Robber II
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * Example 1:
 *
 * Input: [2,3,2]
 * Output: 3
 * Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),
 *              because they are adjacent houses.
 * Example 2:
 *
 * Input: [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 *              Total amount you can rob = 1 + 3 = 4.
 */

public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res1 = helper(nums,0,1);
        int res2 = helper(nums,1,0);
        return Math.max(res1, res2);
    }

    public int helper(int[] nums, int l, int h) {
        int pre2 = 0, pre1 = 0;
        for (int i = l; i < nums.length - h; i++) {
            int cur = Math.max(pre2 + nums[i], pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,5};
        System.out.println(Arrays.toString(a));
    }
}
