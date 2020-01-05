package leetcode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class LevelOrder {
    private List<List<Integer>> levelOrder(Node root) {

        if (root == null) return null;

        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                currLevel.add(curr.val);
                for (Node n: curr.children) {
                    queue.offer(n);
                }
            }
            res.add(currLevel);
        }
        return res;
    }
}
