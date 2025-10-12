class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i<nums.length; i++){
            if (nums[i]>=target){
                return i;
            }
        }
        return (nums.length);
    }
}

// Input: nums = [1,3,5,6], target = 2
// Output: 1

// Input: nums = [1,3,5,6], target = 7
// Output: 4
