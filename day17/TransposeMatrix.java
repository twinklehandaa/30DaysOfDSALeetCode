class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] newmat = new int[matrix[0].length][matrix.length];
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++){
                newmat[j][i] = matrix[i][j] ;
            }
        }
        return newmat;
    }
}

// Input: matrix = [[1,2,3],[4,5,6]]
// Output: [[1,4],[2,5],[3,6]]
