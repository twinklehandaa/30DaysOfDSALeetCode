class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int one = 0; 
        int two = n;
        for (int i = 0; i < 2*n; i+=2){
            arr[i] = nums[one++];
            arr[i+1] = nums[two++];
        }
        return arr;
    }
}

// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7] 
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
