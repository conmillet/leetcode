package leetcode;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeterCount = 0;
        int x = grid[0].length;
        int y = grid.length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == 1) {
                    perimeterCount += count(grid, i, j);
                }
            }
        }
        return perimeterCount;
    }

    private int count(int[][] grid, int i, int j) {
        int count = 0;
        if (j - 1 < 0 || grid[i][j - 1] == 0) count++; // left
        if (j + 1 >= grid[0].length || grid[i][j + 1] == 0) count++; // right
        if (i - 1 < 0 || grid[i - 1][j] == 0) count++; // up
        if (i + 1 >= grid.length || grid[i + 1][j] == 0) count++; // down
        return count;
    }
}
