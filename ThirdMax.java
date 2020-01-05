package leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;

public class ThirdMax {
    private int thirdMax(int[] nums) {

        PriorityQueue<Integer> res = new PriorityQueue<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for (Integer n: nums) {
            if (!res.contains(n)) {
                res.offer(n);
                set.add(n);
                if (res.size() > 3) {
                    set.remove(res.poll());
                }
            }
        }
        if (res.size() < 3) {
            while (res.size() > 1) {
                res.poll();
            }
        }
        return res.peek();
    }
}
