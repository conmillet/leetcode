package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Brute Force
    //public int[] twoSum(int[] nums, int target){
    //    for (int i = 0; i < nums.length; i++){
    //        for (int j = i + 1; j < nums.length; j++){
    //            if (nums[i] == target - nums[j]){
    //                return new int[][] {i,j};
    //            }
    //        }
    //    }
    //    throw new IllegalArgumentException("No twe sum solution");
    //}


    //Two pass Hash Table
    //public int[] twoSum(int[] nums, int target){
    //    Map<Integer,Integer> map = new HashMap<>();
    //  for (int i = 0; i < nums.length; i++){
    //        map.put(nums[i],i);
    //    }
    //    for (int i = 0; i < nums.length; i++){
    //        int complement = target - nums[i];
    //        if (map.containsKey(complement) && map.get(complement) != i){
    //            return new int[] {i, map.get(complement)};
    //        }
    //        throw new IllegalArgumentException("No two sum solution");
    //    }
    //}

    //One pass Hash Table
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
