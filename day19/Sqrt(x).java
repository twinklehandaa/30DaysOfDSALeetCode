class Solution {
    public int mySqrt(int x) {
        if (x<2) return x;

        int odd = 1;
        int count = 0;

        while (x>=odd){
            x = x - odd;
            odd+=2;
            count++;
        }
        return (count);
    }
}

// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
