class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int i =0; i<accounts.length; i++){
            int wealth = 0;
            for (int  j = 0; j<accounts[i].length; j++){
                wealth+=accounts[i][j];
            }
            maxWealth = Math.max(wealth, maxWealth);
        }
        return maxWealth;
    }
}

// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10
// Explanation: 
// 1st customer has wealth = 6
// 2nd customer has wealth = 10 
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.
