/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null) return null;
        ArrayList<Integer> nums = new ArrayList<>();

        while (head!=null){
            nums.add(head.val);
            head = head.next;
        }
        return buildTree(nums, 0, nums.size()-1);
    }

    public TreeNode buildTree(ArrayList<Integer> nums, int left, int right){
        if (left>right) return null;

        int mid = left+(right-left)/2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = buildTree(nums, left, mid-1);
        root.right = buildTree(nums, mid+1, right);

        return root;
    }
}

// Input: head = [-10,-3,0,5,9]
// Output: [0,-3,9,-10,null,5]
// Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
