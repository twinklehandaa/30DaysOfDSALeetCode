class Solution {
    public int binarySearch(int[] nums , int start, int end, int val ){
        if (start>end) return -1;
        int mid = (start+end)/2;
        if (nums[mid] == val) return mid;
        if (val<nums[mid]) return binarySearch(nums, start, mid-1, val);
        if (val>nums[mid]) return binarySearch(nums, mid+1, end, val);
        return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }
}

// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4
