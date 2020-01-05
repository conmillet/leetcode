package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<>();

        if (root == null) return res;
        if (root.left == null && root.right == null) {
            res.add(root.val + "");
            return res;
        }

        for (String path: binaryTreePaths(root.left)) {
            res.add(root.val + "->" + path);
        }
        for (String path: binaryTreePaths(root.right)) {
            res.add(root.val + "->" + path);
        }

        return res;
    }

//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> res = new ArrayList<>();
//        dfs(root, "",res);
//        return res;
//    }
//
//    public void dfs(TreeNode root, String path, List<String> res) {
//        if (root == null) {
//            return;
//        }
//        if (root.left == null && root.right == null) {
//            res.add(path + root.val);
//
//        }
//        if (root.left != null) {
//            dfs(root.left, path + root.val + "->", res);
//
//        }
//        if (root.right != null) {
//            dfs(root.right, path + root.val + "->", res);
//
//        }
//    }
}
