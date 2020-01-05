package leetcode;

public class SpiralMatrixTwo {
    public int[][] spiralMatrix(int n) {
        int[][] res = new int[n][n];

        int rowSt = 0;
        int rowEd = n-1;
        int colSt = 0;
        int colEd = n-1;
        int count = 1;

        while (rowSt <= rowEd && colSt <= colEd) {
            for (int i = colSt; i <= colEd; i++) {
                res[rowSt][i] = count++;
            }
            rowSt++;

            for (int i = rowSt; i <= rowEd; i++) {
                res[i][colEd] = count++;
            }
            colEd--;

            if (rowSt <= rowEd) {
                for (int i = colEd; i >= colSt; i--) {
                    res[rowEd][i] = count++;
                }
            }
            rowEd--;

            if (colSt <= colEd) {
                for (int i = rowEd; i >= rowSt; i--) {
                    res[i][colSt] = count++;
                }
            }
            colSt++;
        }
        return res;
    }
}
