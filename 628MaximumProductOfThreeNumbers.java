class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // case 1: positive num
        int prod1 = nums[n-1]*nums[n-2]*nums[n-3];
        // case 2: negative elements
        int prod2 = nums[0]*nums[1]*nums[n-1];

        return Math.max(prod1, prod2);
    }
}

// Input: nums = [1,2,3]
// Output: 6

// Input: nums = [1,2,3,4]
// Output: 24
