class Solution {
    public int arrayPairSum(int[] nums) {
        int maxSum = 0;
        Arrays.sort(nums);
        int len = nums.length;
        for (int i=0;i<len; i+=2){ //sum of ever other pair
            maxSum+=nums[i];
        }
        return maxSum;
    }
}

// Input: nums = [1,4,3,2]
// Output: 4
// Explanation: All possible pairings (ignoring the ordering of elements) are:
// 1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
// 2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
// 3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
// So the maximum possible sum is 4.
