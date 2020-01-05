package leetcode;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums.length == 0 || nums == null) return;
        int rIndex = nums.length - 2;
        while (rIndex > 0 && nums[rIndex] >= nums[rIndex+1]) {
            rIndex--;
        }
        if (rIndex >= 0) {
            int lIndex = nums.length - 1;
            while (nums[lIndex] <= nums[rIndex]) lIndex--;
            swap(nums, rIndex, lIndex);
        }
        reverse(nums, rIndex+1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }


//    public void nextPermutation(int[] nums) {
//
//        if (nums == null || nums.length == 0) return;
//        int replceIndex = nums.length - 2;
//        while (replceIndex >= 0) {
//            if (nums[replceIndex] < nums[replceIndex + 1]) break;
//            replceIndex--;
//        }
//        if (replceIndex < 0) {
//            Arrays.sort(nums);
//            return;
//        }
//
//        int largeIndex = replceIndex + 1;
//        while (largeIndex < nums.length && nums[largeIndex] > nums[replceIndex]) {
//            largeIndex++;
//        }
//
//        int temp = nums[replceIndex];
//        nums[replceIndex] = nums[largeIndex - 1];
//        nums[largeIndex] = temp;
//        Arrays.sort(nums,replceIndex+1, nums.length);
//        return;
//    }
}
