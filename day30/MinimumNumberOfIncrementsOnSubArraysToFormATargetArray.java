class Solution {
    public int minNumberOperations(int[] target) {
        int n = target.length;
        int result = target[0];
        for (int i = 0 ; i < n ; i++){
            if (target[i] > target[i-1]) result+=target[i] - target[i-1];
        }
        return result;
    }
}

// Input: target = [1,2,3,2,1]
// Output: 3
// Explanation: We need at least 3 operations to form the target array from the initial array.
// [0,0,0,0,0] increment 1 from index 0 to 4 (inclusive).
// [1,1,1,1,1] increment 1 from index 1 to 3 (inclusive).
// [1,2,2,2,1] increment 1 at index 2.
// [1,2,3,2,1] target array is formed.
