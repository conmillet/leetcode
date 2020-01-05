package leetcode;

import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSeen = new HashSet<>();
        while (head != null) {
            if (nodeSeen.contains(head)) {
                return true;
            } else {
                nodeSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
