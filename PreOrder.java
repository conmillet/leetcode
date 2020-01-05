package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
    public List<Integer> preOrder(Node root) {

        List<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        if (root == null) return res;
        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            int size = node.children.size();
            res.add(node.val);
            for (int i = size - 1; i >= 0; i--) {
                stack.add(node.children.get(i));
            }
        }
        return res;


//        List<Integer> res = new ArrayList<>();
//        if (root == null) return res;
//        res.add(root.val);
//
//        for (Node node: root.children) {
//            preOrder(node);
//        }
//
//        return res;

//
//        List<Integer> res = new ArrayList<>();
//        helper(root, res);
//        return res;
//    }
//
//    public void helper(Node root, List<Integer> res) {
//        if (root == null ) return;
//        List<Node> children = root.children;
//        res.add(root.val);
//        for (Node node: children) {
//            helper(node, res);
//        }
//
    }
}
