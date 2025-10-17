class Solution {
    public void swap(int[] nums, int a, int b){
        int temp= nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public void quicksort(int[] nums, int start, int end){
        if (start>=end) return;
        int i = start;
        int j = end;
        int pivot  = nums[start];

        while (i<j){
            while (i<=end && nums[i]<=pivot) i++;
            while (j>start && nums[j]>pivot) j--;
            if (i<j) swap(nums, i, j);
        }
        if (i>j) swap(nums, start, j);

        quicksort(nums, start, j-1);
        quicksort(nums, j+1, end);
    }
    public void sortColors(int[] nums) {
        quicksort(nums, 0, nums.length-1);
    }
}
