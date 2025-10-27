class Solution {
    public int divide(int dividend, int divisor) {
        // handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if (dividend == Integer.MAX_VALUE && divisor == -1)
            return Integer.MIN_VALUE+1;

        // handle divide by zero
        if (divisor == 0)
            throw new ArithmeticException("Division by zero");

        int count = 0;

        // convert to positive
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        //check sign
        boolean negative = (dividend < 0) ^ (divisor < 0); 

        while (ldividend>=ldivisor){
            ldividend-=ldivisor;
            count++;
        }

        return negative?-count:count;
    }
}

// Input: dividend = 10, divisor = 3
// Output: 3
// Explanation: 10/3 = 3.33333.. which is truncated to 3.
