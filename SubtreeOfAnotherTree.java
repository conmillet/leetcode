package leetcode;

import com.sun.source.tree.Tree;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (sameTree(s,t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean sameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        return s.val == t.val && sameTree(s.left, t.left) && sameTree(s.right, t.right);
    }
}
