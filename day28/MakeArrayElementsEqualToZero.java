class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        int sum = 0;
        int x = 0;
        int n = nums.length;

        for (int num: nums){
            sum+=num;
        }

        for (int curr = 0; curr < n; curr++){
            x+=nums[curr];
            if (nums[curr]==0){
                if (2*x==sum) count+=2;
                else if (Math.abs(sum - 2*x)==1) count++;
            }
        }
        return count;
    }
}

// Input: nums = [1,0,2,0,3]
// Output: 2

// Explanation:
// The only possible valid selections are the following:

// Choose curr = 3, and a movement direction to the left.
// [1,0,2,0,3] -> [1,0,2,0,3] -> [1,0,1,0,3] -> [1,0,1,0,3] -> [1,0,1,0,2] -> [1,0,1,0,2] -> [1,0,0,0,2] -> [1,0,0,0,2] -> [1,0,0,0,1] -> [1,0,0,0,1] -> [1,0,0,0,1] -> [1,0,0,0,1] -> [0,0,0,0,1] -> [0,0,0,0,1] -> [0,0,0,0,1] -> [0,0,0,0,1] -> [0,0,0,0,0].
// Choose curr = 3, and a movement direction to the right.
// [1,0,2,0,3] -> [1,0,2,0,3] -> [1,0,2,0,2] -> [1,0,2,0,2] -> [1,0,1,0,2] -> [1,0,1,0,2] -> [1,0,1,0,1] -> [1,0,1,0,1] -> [1,0,0,0,1] -> [1,0,0,0,1] -> [1,0,0,0,0] -> [1,0,0,0,0] -> [1,0,0,0,0] -> [1,0,0,0,0] -> [0,0,0,0,0].
