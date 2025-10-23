class Solution {
    public boolean isPowerOfFour(int n) {
        if (n<=0) return false;
        while (n%4==0){
            n/=4;
        }
        return n==1;
    }
}

// Input: n = 16
// Output: true

// Input: n = 5
// Output: false
