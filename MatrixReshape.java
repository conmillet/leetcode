package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MatrixReshape {
    public int[][] matrixReshaple(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        int rows = 0, cols = 0;

        if (nums.length == 0 || r * c != nums[0].length * nums.length) {
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[rows][cols] = nums[i][j];
                cols++;
                if (cols == nums[0].length) {
                    rows++;
                    cols = 0;
                }
            }
        }
        return res;
    }
}



//    public int[][] matrixReshape(int[][] nums, int r, int c) {
//        int[][] res = new int[r][c];
//        if (nums.length == 0 || r*c != nums[0].length*nums.length) {
//            return nums;
//        }
//
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 0; i< nums.length; i++) {
//            for (int j = 0; j < nums[0].length; j++) {
//                queue.add(nums[i][j]);
//            }
//        }
//        for (int i = 0; i < r; i++){
//            for (int j = 0; j < c; j++) {
//                res[i][j] = queue.remove();
//            }
//        }
//        return res;
//    }

