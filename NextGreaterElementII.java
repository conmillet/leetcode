package leetcode;

import java.util.Stack;

public class NextGreaterElementII {
    public int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num){
                res[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return res;
    }
}
