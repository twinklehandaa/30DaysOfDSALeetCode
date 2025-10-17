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
  //inorder successor
    public TreeNode findMin(TreeNode root){ 
        while (root.left!=null) root = root.left;
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null) return root;

        if (key<root.val) root.left = deleteNode(root.left, key);
        else if (key>root.val) root.right = deleteNode(root.right, key);

        else{
            if (root.left==null && root.right==null) return null;
            else if (root.left==null) return root.right;
            else if (root.right==null) return root.left;
            else{
                TreeNode inorderSuccessor = findMin(root.right);
                root.val = inorderSuccessor.val;
                root.right = deleteNode(root.right, inorderSuccessor.val);
            }
        }
        return root;
    }
}

// Input: root = [5,3,6,2,4,null,7], key = 3
// Output: [5,4,6,2,null,null,7]
// Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
// One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
// Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.
