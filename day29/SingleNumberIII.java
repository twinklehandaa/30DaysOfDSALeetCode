class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if(nums[j]==nums[i]) count++;
            }
            if (count==1) ans[index++] = nums[i];
        }
        return ans;
    }
}

// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer.
