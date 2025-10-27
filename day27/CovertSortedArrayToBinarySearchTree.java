/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length-1);
    }
    
    public TreeNode buildTree(int[] nums, int left, int right){
        if (left>right) return null;

        int mid = left+(right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, left, mid-1);
        root.right = buildTree(nums, mid+1, right);

        return root;
    }
}

// Input: nums = [-10,-3,0,5,9]
// Output: [0,-3,9,-10,null,5]
// Explanation: [0,-10,5,null,-3,null,9] is also accepted:
