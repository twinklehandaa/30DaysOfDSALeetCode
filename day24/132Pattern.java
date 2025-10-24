class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE; // represents nums[k]

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < third) return true; // found nums[i] < nums[k]
            
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop(); // stack pop simulates nums[k]
            }

            stack.push(nums[i]);
        }

        return false;
    }
}

// Input: nums = [-1,3,2,0]
// Output: true
// Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
