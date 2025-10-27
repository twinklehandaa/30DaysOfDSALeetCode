class Solution {
    public int numberOfBeams(String[] bank) {
        int total = 0;
        int x = 0;
        for (String row : bank){
            int count = 0;
            for (char c: row.toCharArray()){
                if (c=='1') count++; //count devices per row;
            }
            if (count>0){
                total += x*count;
                x = count;
            }
        }
        return total;
    }
}

// Input: bank = ["011001","000000","010100","001000"]
// Output: 8
// Explanation: Between each of the following device pairs, there is one beam. In total, there are 8 beams:
//  * bank[0][1] -- bank[2][1]
//  * bank[0][1] -- bank[2][3]
//  * bank[0][2] -- bank[2][1]
//  * bank[0][2] -- bank[2][3]
//  * bank[0][5] -- bank[2][1]
//  * bank[0][5] -- bank[2][3]
//  * bank[2][1] -- bank[3][2]
//  * bank[2][3] -- bank[3][2]
// Note that there is no beam between any device on the 0th row with any on the 3rd row.
// This is because the 2nd row contains security devices, which breaks the second condition.
