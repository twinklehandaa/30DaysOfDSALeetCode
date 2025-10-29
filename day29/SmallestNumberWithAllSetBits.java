class Solution {
    public int smallestNumber(int n) {
        for (int i = 0; i <=n; i++){
            int x = 1<<i; //1 << i gives you powers of two.
            if (x > n) return x - 1; //looking for the first power of two greater than n,
        }
        return 0;
    }
}
// (x-1) Subtracting 1 from a power of two gives you a number with all bits set to 1 below that power.

// Input: n = 5
// Output: 7
// Explanation:
// The binary representation of 7 is "111".
