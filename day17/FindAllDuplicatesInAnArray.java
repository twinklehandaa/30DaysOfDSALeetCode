class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        for (int n : nums){
            if (!visited.add(n)) dup.add(n);
        }
        return dup;
    }
}

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]
