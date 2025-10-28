class Solution {
    public long removeZeros(long n) {
        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder();

        for (char ch: s.toCharArray()){
            if (ch!='0') sb.append(ch);
        }

        String x = sb.toString();
        return Long.parseLong(x);

    }
}

// Input: n = 1020030
// Output: 123
// Explanation:
// After removing all zeros from 1020030, we get 123.
