class Solution {
    public int findPeakElement(int[] nums) {
        int peak = 0;
        for (int i = 1; i < nums.length; i++){
            if (i==(nums.length-1)) {
                if (nums[i]>nums[i-1]) peak = i;
            }
            else{
                if (nums[i]>nums[i+1] && nums[i]>nums[i-1]) peak = i;
            }
        }
        return peak;
    }
}

// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index number 2.
