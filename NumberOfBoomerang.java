package leetcode;

import java.util.HashMap;

public class NumberOfBoomerang {
    public int numberOfBoomerang(int[][] points) {
        int res = 0;
        HashMap<Integer, Integer> distances = new HashMap<Integer, Integer>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int d = getDistance(points[i], points[j]);
                distances.put(d, distances.getOrDefault(d, 0) + 1);
            }
            for (int val: distances.values()) {
                res += val * (val - 1);
            }
            distances.clear();
        }
        return res;
    }

    private int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        int distance = dx * dx + dy * dy;
        return distance;
    }
}
