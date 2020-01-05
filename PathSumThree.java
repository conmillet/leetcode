package leetcode;

// root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
//
//        10
//       /  \
//      5   -3
//     / \    \
//    3   2   11
//   / \   \
//  3  -2   1
//
//  Return 3. The paths that sum to 8 are:
//
//  1.  5 -> 3
//  2.  5 -> 2 -> 1
//  3. -3 -> 11


import java.util.HashMap;

public class PathSumThree {
    public int pathSum(TreeNode root, int sum) {
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        return helper(root, 0, sum, preSum);
    }

    public int helper(TreeNode root, int currSum, int target, HashMap<Integer, Integer> preSum) {
        if (root == null) return 0;

        currSum += root.val;
        int res = preSum.getOrDefault(currSum - target,0);
        preSum.put(currSum, preSum.getOrDefault(currSum, 0) + 1);

        res += helper(root.left, currSum, target, preSum) + helper(root.right, currSum, target, preSum);
        preSum.put(currSum, preSum.get(currSum) - 1);
        return res;
    }

//    public int pathSum(TreeNode root, int sum) {
//        if (root == null) return 0;
//        return pathSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
//    }
//
//    private int pathSumFrom(TreeNode node, int sum) {
//        if (node == null) return 0;
//        return (node.val == sum? 1:0) + pathSumFrom(node.left,sum - node.val) + pathSumFrom(node.right, sum - node.val);
//    }


//    public int pathSum(TreeNode root, int sum) {
//        if (root == null) return 0;
//        int pathLeading = count(root, sum);
//        int leftPathSum = pathSum(root.left, sum);
//        int rightPathSum = pathSum(root.right, sum);
//        return pathLeading + rightPathSum + leftPathSum;
//    }
//
//    private int count(TreeNode node, int sum) {
//        if (node == null) return 0;
//        int isMe = (node.val == sum) ? 1 : 0;
//        int left = count(node.left, sum - node.val);
//        int right = count(node.right, sum - node.val);
//        return isMe + left + right;
//    }
}
