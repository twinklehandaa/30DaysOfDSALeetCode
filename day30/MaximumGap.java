class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n < 2) return 0;
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < n-1; i++){
            int diff = nums[i+1] - nums[i];
            maxDiff = Math.max(diff, maxDiff);
        }
        return maxDiff;
    }
}

// Input: nums = [3,6,9,1]
// Output: 3
// Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
