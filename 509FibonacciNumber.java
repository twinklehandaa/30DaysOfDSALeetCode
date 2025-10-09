class Solution {
    public int fib(int n) {
        if (n==0) return 0;
        if (n==1) return 1;

        int sum = 0;
        int first = 0;
        int second = 1;

        for(int i=1; i<n; i++){
            sum = first + second;
            first = second;
            second  = sum;
        }
        
        return sum;
    }
}
// Input: n = 2
// Output: 1
// Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
