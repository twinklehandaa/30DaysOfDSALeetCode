class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        
        for (int num: nums){
            if (num==1) {
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else count = 0;
        }
        return maxCount;
    }
}

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
