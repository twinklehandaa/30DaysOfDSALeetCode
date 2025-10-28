class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            if (i%2==0) sum+=nums[i];
            if (i%2!=0) sum-=nums[i];
        }
        return sum;
    }
}

// Input: nums = [1,3,5,7]
// Output: -4
// Explanation:
// Elements at even indices are nums[0] = 1 and nums[2] = 5 because 0 and 2 are even numbers.
// Elements at odd indices are nums[1] = 3 and nums[3] = 7 because 1 and 3 are odd numbers.
// The alternating sum is nums[0] - nums[1] + nums[2] - nums[3] = 1 - 3 + 5 - 7 = -4.
