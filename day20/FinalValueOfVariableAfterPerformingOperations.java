class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;                 
        for (String ch: operations){
            if (ch.contains("--")){
                x--;
            }
            if (ch.contains("++")){
                x++;
            }
        }
        return x;
    }
}

// Input: operations = ["--X","X++","X++"]
// Output: 1
// Explanation: The operations are performed as follows:
// Initially, X = 0.
// --X: X is decremented by 1, X =  0 - 1 = -1.
// X++: X is incremented by 1, X = -1 + 1 =  0.
// X++: X is incremented by 1, X =  0 + 1 =  1.
