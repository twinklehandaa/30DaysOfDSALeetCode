class Solution {
    public int findClosest(int x, int y, int z) {
        int a = Math.abs(x-z);
        int b = Math.abs(y-z);
        if (a<b) return 1;
        if (a>b) return 2;
        if (a==b) return 0;

        return 0;
    }
}

// Input: x = 2, y = 7, z = 4
// Output: 1
// Person 1 is at position 2 and can reach Person 3 (at position 4) in 2 steps.
// Person 2 is at position 7 and can reach Person 3 in 3 steps.
// Since Person 1 reaches Person 3 first, the output is 1.
