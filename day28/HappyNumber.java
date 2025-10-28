class Solution {
    public int squareOfDigits(int n){
        int result = 0;
        while (n>0){
            int digit = n%10;
            result+=digit*digit;
            n/=10;
        }
        return result;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = squareOfDigits(slow);
            fast = squareOfDigits(squareOfDigits(fast));
        } while (slow!=fast);

        return slow==1?true:false;
    }
}

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1
