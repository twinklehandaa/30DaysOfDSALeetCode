class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i]==nums[i+1]) {
                result^=nums[i];
            }
        }
        return result;
    }
}

// Input: nums = [1,2,2,1]
// Output: 3
// Explanation:
// Numbers 1 and 2 appeared twice. 1 XOR 2 == 3.
