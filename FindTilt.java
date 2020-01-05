package leetcode;

public class FindTilt {
    int res = 0;
    public int findTilt(TreeNode root) {
        traverse(root);
        return res;
    }

    private int traverse(TreeNode root) {
        if (root == null) return 0;
        int l = traverse(root.left);
        int r = traverse(root.right);

        res += Math.abs(l - r);
        return l + r + root.val;
    }
}
