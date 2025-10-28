class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int index = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++){
              if (nums[i]==nums[i+1]) arr[index++] = nums[i];
        }
        return arr;
    }
}

// Input: nums = [0,1,1,0]
// Output: [0,1]
// Explanation:
// The numbers 0 and 1 each appear twice in the array.
