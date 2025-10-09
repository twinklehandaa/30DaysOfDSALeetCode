class Solution {
    public boolean isPerfectSquare(int num) {
        if (num==1) return true;
        int odd = 1;
        while (num>0){
            num = num - odd;
            odd = odd + 2;
        }
        return num==0;
    }
}
// Example Walkthrough

// For num = 16:
// Subtract 1 → 15
// Subtract 3 → 12
// Subtract 5 → 7
// Subtract 7 → 0 ✅ (Perfect square)
