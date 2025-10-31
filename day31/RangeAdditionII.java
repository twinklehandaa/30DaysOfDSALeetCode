class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minCol = n;

        for (int[]op: ops){
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }
        return minRow * minCol;
    }
}
// maximum number in the matrix will be in the top-left minX x minY submatrix. Since all operations increment the value in this submatrix, 
// the number of elements in this submatrix (given by the product of minX and minY) will be the maximum value in the matrix.

// Input: m = 3, n = 3, ops = [[2,2],[3,3]]
// Output: 4
// Explanation: The maximum integer in M is 2, and there are four of it in M. So return 4.
