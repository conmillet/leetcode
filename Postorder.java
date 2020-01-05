package leetcode;

import java.util.*;

public class Postorder {
    private List<Integer> postorder(Node root) {

        List<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        if (root == null) return res;
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            res.add(node.val);
            for (Node n: node.children) {
                stack.add(n);
            }
        }
        Collections.reverse(res);
        return res;


//        List<Integer> res = new ArrayList<>();
//        helper(root, res);
//        return res;
//    }
//
//    private void helper(Node root, List<Integer> res) {
//        if (root == null) return;
//        for (Node n: root.children) {
//            helper(n, res);
//        }
//        res.add(root.val);
    }
}
