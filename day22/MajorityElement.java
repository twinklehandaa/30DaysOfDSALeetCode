class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        for (int i = 0; i<nums.length; i++){
            int count = 0;
            for (int j = 0; j<nums.length; j++){
                if (nums[i]==nums[j]) count++;
            }
            if (count>(nums.length/2)) {
                majority = nums[i];
                break;
            }
        }
        return majority;
    }
}

// O(n) solution:
// class Solution {
//     public int majorityElement(int[] nums) {
//         int candidate = 0;
//         int count = 0;

//         for (int num : nums) {
//             if (count == 0) candidate = num;
//             count += (num == candidate) ? 1 : -1;
//         }

//         return candidate;
//     }
// }
// Input: nums = [3,2,3]
// Output: 3
