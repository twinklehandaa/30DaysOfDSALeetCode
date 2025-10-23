class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n<=0) return false;
        while (n%2==0){
            n/=2;
        }
        return n==1;
    }
}

// Input: n = 16
// Output: true
// Explanation: 24 = 16
